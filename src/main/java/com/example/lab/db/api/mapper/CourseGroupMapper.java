package com.example.lab.db.api.mapper;

import com.example.lab.db.api.dto.CourseGroupDTO;
import com.example.lab.db.api.dto.CourseGroupList;
import com.example.lab.db.api.model.CourseGroup;
import com.example.lab.db.api.model.DayOfWeekEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CourseGroupMapper {

    default CourseGroupDTO toDTO(CourseGroup courseGroup) {
        Set<DayOfWeek> dayOfWeeks = courseGroup.getDaysOfWeek().stream().map(DayOfWeekEntity::getDayOfWeek)
                .collect(Collectors.toSet());
        return new CourseGroupDTO(courseGroup.getId(), courseGroup.getStartTime(), courseGroup.getEndTime(), dayOfWeeks);
    }

    default CourseGroupList toListDTO(List<CourseGroup> courseGroups) {
        List<CourseGroupDTO> courseGroupDTOS = courseGroups.stream().map(this::toDTO).toList();
        return new CourseGroupList(courseGroupDTOS);
    }

}
