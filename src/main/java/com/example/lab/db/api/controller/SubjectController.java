package com.example.lab.db.api.controller;

import com.example.lab.db.api.dto.SubjectList;
import com.example.lab.db.api.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/subjects/")
public class SubjectController {

    private final SubjectService subjectService;

    @GetMapping
    public SubjectList getAllSubjects() {
        return subjectService.getAllSubject();
    }
}
