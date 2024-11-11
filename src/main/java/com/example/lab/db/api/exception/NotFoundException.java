package com.example.lab.db.api.exception;

import com.example.lab.db.api.enums.ErrorCode;
import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiException {

    public NotFoundException(String message, ErrorCode errorCode) {
        super(message, HttpStatus.NOT_FOUND, errorCode);
    }

    public NotFoundException(ErrorCode errorCode) {
        this(errorCode.getMessage(), errorCode);
    }
}
