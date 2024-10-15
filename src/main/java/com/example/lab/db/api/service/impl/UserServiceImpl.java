package com.example.lab.db.api.service.impl;

import com.example.lab.db.api.dto.CreateUserRequest;
import com.example.lab.db.api.mapper.UserMapper;
import com.example.lab.db.api.model.User;
import com.example.lab.db.api.repository.UserRepository;
import com.example.lab.db.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public void createUser(CreateUserRequest request) {
        User user = userMapper.toEntity(request);
        userRepository.save(user);
    }
}
