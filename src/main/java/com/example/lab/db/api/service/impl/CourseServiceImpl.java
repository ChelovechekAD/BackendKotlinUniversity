package com.example.lab.db.api.service.impl;

import com.example.lab.db.api.dto.CourseList;
import com.example.lab.db.api.mapper.CoursesMapper;
import com.example.lab.db.api.model.Course;
import com.example.lab.db.api.repository.CourseRepository;
import com.example.lab.db.api.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CoursesMapper coursesMapper;

    @Override
    public CourseList getAllCoursesBySubjectId(Long subjectId) {
        List<Course> courses = courseRepository.getCoursesBySubjectId(subjectId);
        return coursesMapper.toListDto(courses);
    }
}
