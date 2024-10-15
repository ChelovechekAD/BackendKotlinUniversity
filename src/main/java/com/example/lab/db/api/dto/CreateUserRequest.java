package com.example.lab.db.api.dto;

public record CreateUserRequest(String email, String login, String password, String phone) {
}
