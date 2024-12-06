package com.example.lab.db.api.service;

import com.example.lab.db.api.dto.CourseList;

public interface CourseService {

    CourseList getAllCoursesBySubjectId(Long subjectId);
}
