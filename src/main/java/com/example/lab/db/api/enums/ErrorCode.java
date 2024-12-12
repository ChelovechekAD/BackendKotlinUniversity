package com.example.lab.db.api.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {

    ERR_OBJECT_NOT_FOUND("The requested object with ID %s was not found!"),
    ERR_USER_NOT_FOUND("User with login '%s' was not found!"),
    ERR_WRONG_CREDENTIALS("Wrong user credentials!"),
    ERR_UNKNOWN_CODE("Something went wrong!"),
    ERR_USER_EXISTS("User with %s '%s' already exists!");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }
}
