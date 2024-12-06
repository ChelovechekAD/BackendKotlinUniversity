package com.example.lab.db.api.mapper;

import com.example.lab.db.api.dto.CourseDTO;
import com.example.lab.db.api.dto.CourseList;
import com.example.lab.db.api.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CoursesMapper {

    CourseDTO toDto(Course course);

    default CourseList toListDto(List<Course> courses) {
        List<CourseDTO> courseDTOS = courses.stream().map(this::toDto).toList();
        return new CourseList(courseDTOS);
    }
}
