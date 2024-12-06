package com.example.lab.db.api.dto;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

public record CourseGroupDTO(Long id, LocalTime startTime, LocalTime endTime, Set<DayOfWeek> daysOfWeek) {
}
