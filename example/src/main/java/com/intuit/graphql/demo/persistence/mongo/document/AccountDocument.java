package com.intuit.graphql.demo.persistence.mongo.document;

/**
 * @author nevinsunny
 * date 27/02/23
 * time 12:17 PM
 */


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

/**
 * @author nevinsunny
 * date 15/02/23
 * time 5:20 PM
 */
@Document(collection = "accounts")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDocument {
    @Id
    private String id;
    private Integer account_id;
    private Integer limit;
    private List<String> products;
    private UUID someUUID;
    private String someString;
}