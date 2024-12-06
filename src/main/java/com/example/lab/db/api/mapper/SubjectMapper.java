package com.example.lab.db.api.mapper;

import com.example.lab.db.api.dto.SubjectDTO;
import com.example.lab.db.api.dto.SubjectList;
import com.example.lab.db.api.model.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SubjectMapper {

    SubjectDTO subjectToSubjectDTO(Subject subject);

    default SubjectList toSubjectList(List<Subject> subjects) {
        List<SubjectDTO> subjectDTOS = subjects.stream().map(this::subjectToSubjectDTO).toList();
        return new SubjectList(subjectDTOS);
    }
}
