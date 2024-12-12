package com.example.lab.db.api.controller;

import com.example.lab.db.api.dto.CourseList;
import com.example.lab.db.api.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/courses/")
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public CourseList getCoursesBySubjectId(@RequestParam("subjectId") Long subjectId) {
        return courseService.getAllCoursesBySubjectId(subjectId);
    }
}
