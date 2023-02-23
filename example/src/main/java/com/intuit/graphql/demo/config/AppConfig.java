package com.intuit.graphql.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.intuit.graphql.demo")
@EnableTransactionManagement
@EnableMongoRepositories(basePackages = "com.intuit.graphql.demo.persistence.mongo.repository")
public class AppConfig {
}
