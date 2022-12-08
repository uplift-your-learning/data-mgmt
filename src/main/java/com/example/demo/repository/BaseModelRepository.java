package com.example.demo.repository;

import com.example.demo.model.BaseModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseModelRepository extends MongoRepository<BaseModel, String> {

    BaseModel getBaseModelBySubjectAndChapterNumber(final String subject, final int chapter);
}
