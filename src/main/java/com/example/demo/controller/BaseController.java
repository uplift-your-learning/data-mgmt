package com.example.demo.controller;

import com.example.demo.model.BaseModel;
import com.example.demo.repository.BaseModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class BaseController {

    private final BaseModelRepository baseModelRepository;

    @PostMapping("/chapters/add")
    public BaseModel addDoc(@RequestBody BaseModel baseModel) {
        return baseModelRepository.save(baseModel);
    }

    @GetMapping("/chapters/{chapterNumber}")
    public BaseModel getDoc(@PathVariable final  int chapterNumber) {
        return baseModelRepository.findBySubjectAndChapterNumber("SQL", chapterNumber);
    }

}
