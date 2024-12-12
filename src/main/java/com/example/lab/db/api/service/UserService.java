package com.example.lab.db.api.service;

import com.example.lab.db.api.model.User;

public interface UserService {

    void createUser(User user);

    void deleteUser(String login);

    User getUser(String login);
}
