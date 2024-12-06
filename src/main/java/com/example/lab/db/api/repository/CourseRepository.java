package com.example.lab.db.api.repository;

import com.example.lab.db.api.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> getCoursesBySubjectId(Long subjectId);
}
