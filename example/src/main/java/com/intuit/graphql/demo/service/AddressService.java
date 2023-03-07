package com.intuit.graphql.demo.service;

import com.intuit.graphql.demo.persistence.mongo.document.AccountDocument;
import com.intuit.graphql.demo.persistence.mongo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressService {

    @Autowired
    private  MongoTemplate mongoTemplate;

    @Autowired
    private AccountRepository accountRepository;


    public List<AccountDocument> searchAccount(Criteria criteria) {

        Query query = new Query().addCriteria(criteria);

        return mongoTemplate
                .find(query.with(PageRequest.of(0,10)), AccountDocument.class);

    }


}
