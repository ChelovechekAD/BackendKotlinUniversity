package com.example.lab.db.api.service;

import com.example.lab.db.api.dto.LoginRequest;
import com.example.lab.db.api.dto.RegistrationRequest;
import com.example.lab.db.api.dto.UserDTO;

public interface AuthService {

    UserDTO login(LoginRequest loginRequest);

    void register(RegistrationRequest request);
}
