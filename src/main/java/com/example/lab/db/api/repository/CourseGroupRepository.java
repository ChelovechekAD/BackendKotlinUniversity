package com.example.lab.db.api.repository;

import com.example.lab.db.api.model.Course;
import com.example.lab.db.api.model.CourseGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseGroupRepository extends JpaRepository<CourseGroup, Integer> {

    List<CourseGroup> getCourseGroupByCourseId(Long courseId);
}
