package com.intuit.graphql.demo.persistence.mongo.repository;

import com.intuit.graphql.demo.persistence.mongo.document.AccountDocument;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author nevinsunny
 * date 23/02/23
 * time 4:50 PM
 */
public interface AccountRepository extends MongoRepository<AccountDocument, String> {

}
