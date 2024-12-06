package com.example.lab.db.api.dto;

import com.example.lab.db.api.model.CourseGroup;

import java.util.List;

public record CourseGroupList(List<CourseGroupDTO> courseGroups) {
}
