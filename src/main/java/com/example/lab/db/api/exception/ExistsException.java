package com.example.lab.db.api.exception;

import com.example.lab.db.api.enums.ErrorCode;

public class ExistsException extends ApiException {
    public ExistsException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }
}
