package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {

    @Id
    private String id;

    private String subject;

    private String content;

    private int chapterNumber;
}
