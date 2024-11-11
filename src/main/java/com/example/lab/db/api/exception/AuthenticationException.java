package com.example.lab.db.api.exception;

import com.example.lab.db.api.enums.ErrorCode;
import org.springframework.http.HttpStatus;

public class AuthenticationException extends ApiException {
    public AuthenticationException(ErrorCode errorCode) {
        super(errorCode.getMessage(), HttpStatus.UNAUTHORIZED, errorCode);
    }
}
