package com.example.lab.db.api.service.impl;

import com.example.lab.db.api.dto.LoginRequest;
import com.example.lab.db.api.dto.RegistrationRequest;
import com.example.lab.db.api.dto.UserDTO;
import com.example.lab.db.api.enums.ErrorCode;
import com.example.lab.db.api.exception.AuthenticationException;
import com.example.lab.db.api.mapper.UserMapper;
import com.example.lab.db.api.model.User;
import com.example.lab.db.api.service.AuthService;
import com.example.lab.db.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserService userService;

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDTO login(LoginRequest loginRequest) {
        User user = userService.getUser(loginRequest.login());
        if (passwordEncoder.matches(loginRequest.password(), user.getPassword())) {
            return userMapper.toDTO(user);
        } else {
            throw new AuthenticationException(ErrorCode.ERR_WRONG_CREDENTIALS);
        }
    }

    @Override
    public void register(RegistrationRequest request) {
        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(request.password()));
        userService.createUser(user);
    }
}
