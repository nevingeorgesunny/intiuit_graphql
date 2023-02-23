package com.intuit.graphql.demo.service;

import com.intuit.graphql.demo.persistence.mongo.document.AccountDocument;
import com.intuit.graphql.demo.persistence.mongo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
//@Transactional
public class AddressService {

//    @Autowired
//    private AddressRepository addressRepository;

    @Autowired
    private  MongoTemplate mongoTemplate;
    @Autowired
    private AccountRepository accountRepository;

//    public  List<Map<String, String>> searchAddresses(Specification<AddressEntity> specification) {
//        List<AddressEntity> addresses = addressRepository.findAll(specification);
//
//        List<Map<String,String>> addressList = transform(addresses);
//        return addressList;

//        return null;

//    }

    public List<AccountDocument> searchAccout(Criteria criteria) {

        accountRepository.findAll();
//        List<AddressEntity> addresses = addressRepository.findAll(specification);
//
//        List<Map<String,String>> addressList = transform(addresses);
//        return addressList;

        Query query = new Query().addCriteria(criteria);
//
//
        return mongoTemplate
                .find(query.with(PageRequest.of(0,10)), AccountDocument.class);



    }

//    private List<Map<String,String>> transform(List<AddressEntity> addressEntities) {
//        List<Map<String,String>> addressList = new ArrayList<>();
//
//        for (AddressEntity addressEntity: addressEntities) {
//            Map<String, String> address = new HashMap<>();
//            address.put("id", addressEntity.getId());
//            address.put("street", addressEntity.getStreet());
//            address.put("city", addressEntity.getCity());
//            address.put("state", addressEntity.getState());
//            address.put("zipCode", addressEntity.getZipCode().toString());
//            addressList.add(address);
//        }
//        return addressList;
//    }
}
