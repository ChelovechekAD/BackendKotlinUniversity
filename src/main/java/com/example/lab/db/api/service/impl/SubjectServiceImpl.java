package com.example.lab.db.api.service.impl;

import com.example.lab.db.api.dto.SubjectList;
import com.example.lab.db.api.mapper.SubjectMapper;
import com.example.lab.db.api.model.Subject;
import com.example.lab.db.api.repository.SubjectRepository;
import com.example.lab.db.api.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    @Override
    public SubjectList getAllSubject() {
        List<Subject> subjects = subjectRepository.findAll();
        return subjectMapper.toSubjectList(subjects);
    }
}
