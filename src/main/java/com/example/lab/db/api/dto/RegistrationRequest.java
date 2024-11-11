package com.example.lab.db.api.dto;

public record RegistrationRequest(String email, String login, String password, String phone) {
}
