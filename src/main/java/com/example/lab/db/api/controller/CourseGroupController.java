package com.example.lab.db.api.controller;

import com.example.lab.db.api.dto.CourseGroupList;
import com.example.lab.db.api.service.CourseGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/courses/groups/")
public class CourseGroupController {

    private final CourseGroupService courseGroupService;

    @GetMapping
    public CourseGroupList getCourseGroupListByCourseId(@RequestParam("courseId") Long courseId) {
        return courseGroupService.getAllGroupsByCourseId(courseId);
    }
}
