package com.example.lab.db.api.dto;

import com.example.lab.db.api.model.Course;

import java.util.List;

public record CourseList(List<CourseDTO> courses) {
}
