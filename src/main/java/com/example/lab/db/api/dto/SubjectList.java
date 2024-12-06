package com.example.lab.db.api.dto;

import com.example.lab.db.api.model.Subject;

import java.util.List;

public record SubjectList(List<SubjectDTO> subjects) {
}
