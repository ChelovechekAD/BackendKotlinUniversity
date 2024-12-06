package com.example.lab.db.api.service;

import com.example.lab.db.api.dto.CourseGroupList;
import com.example.lab.db.api.model.CourseGroup;

public interface CourseGroupService {

    CourseGroupList getAllGroupsByCourseId(Long courseId);
}
