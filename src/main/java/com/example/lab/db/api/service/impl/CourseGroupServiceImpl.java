package com.example.lab.db.api.service.impl;

import com.example.lab.db.api.dto.CourseGroupList;
import com.example.lab.db.api.mapper.CourseGroupMapper;
import com.example.lab.db.api.model.Course;
import com.example.lab.db.api.model.CourseGroup;
import com.example.lab.db.api.repository.CourseGroupRepository;
import com.example.lab.db.api.repository.CourseRepository;
import com.example.lab.db.api.service.CourseGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseGroupServiceImpl implements CourseGroupService {

    private final CourseGroupRepository courseGroupRepository;
    private final CourseGroupMapper courseGroupMapper;

    @Override
    public CourseGroupList getAllGroupsByCourseId(Long courseId) {
        List<CourseGroup> courses = courseGroupRepository.getCourseGroupByCourseId(courseId);
        return courseGroupMapper.toListDTO(courses);
    }
}
