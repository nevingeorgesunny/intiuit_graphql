package com.intuit.graphql.demo.persistence.mongo.document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author nevinsunny
 * date 24/02/23
 * time 3:28 PM
 */
@Document(collection = "mini_question_bank")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MiniQuestionBankDocument {
    @Id
    private UUID miniQuestionBankId;
    private String name;
    private String description;
    private List<UUID> exerciseIds;
    private Map<String,Object> tags;
    private String createdBy;
    private String updatedBy;
}
