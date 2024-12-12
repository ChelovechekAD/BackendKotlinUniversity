package com.example.lab.db.api.dto.exception;

import com.example.lab.db.api.enums.ErrorCode;

import java.time.LocalDateTime;

public record ExceptionResponse(LocalDateTime timestamp, ErrorCode code, String message, String path) {
}
