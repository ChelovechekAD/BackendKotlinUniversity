package com.example.lab.db.api.dto;

import java.util.UUID;

public record UserDTO(UUID id, String login, String email, String phone, String password) {
}
