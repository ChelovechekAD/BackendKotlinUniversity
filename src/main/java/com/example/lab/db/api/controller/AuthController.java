package com.example.lab.db.api.controller;

import com.example.lab.db.api.dto.LoginRequest;
import com.example.lab.db.api.dto.RegistrationRequest;
import com.example.lab.db.api.dto.UserDTO;
import com.example.lab.db.api.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/registration")
    @ResponseStatus(HttpStatus.CREATED)
    public void registration(@RequestBody RegistrationRequest request) {
        authService.register(request);
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
