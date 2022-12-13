package com.example.demo.repository;

import com.example.demo.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseModelRepository extends JpaRepository<BaseModel, String> {

    BaseModel findBySubjectAndChapterNumber(final String subject, final int chapter);
}
