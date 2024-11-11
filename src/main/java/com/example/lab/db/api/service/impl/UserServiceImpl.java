package com.example.lab.db.api.service.impl;

import com.example.lab.db.api.enums.ErrorCode;
import com.example.lab.db.api.exception.ExistsException;
import com.example.lab.db.api.exception.LogExceptionWrapper;
import com.example.lab.db.api.exception.NotFoundException;
import com.example.lab.db.api.mapper.UserMapper;
import com.example.lab.db.api.model.User;
import com.example.lab.db.api.repository.UserRepository;
import com.example.lab.db.api.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    @Transactional
    public void createUser(User user) {
        if (userRepository.existsByLogin(user.getLogin())) {
            throw new ExistsException(String.format(ErrorCode.ERR_USER_EXISTS.getMessage(), "login", user.getLogin()),
                    ErrorCode.ERR_USER_EXISTS);
        }
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new ExistsException(String.format(ErrorCode.ERR_USER_EXISTS.getMessage(), "email", user.getEmail()),
                    ErrorCode.ERR_USER_EXISTS);
        }
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(String login) {
        User user = this.getUser(login);
        userRepository.delete(user);
    }

    @Override
    public User getUser(String login) {
        return userRepository.findByLogin(login)
                .orElseThrow(() -> LogExceptionWrapper.logErrorException(new NotFoundException(
                        String.format(ErrorCode.ERR_USER_NOT_FOUND.getMessage(), login), ErrorCode.ERR_USER_NOT_FOUND)));
    }
}
