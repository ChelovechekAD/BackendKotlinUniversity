package com.example.lab.db.api.exception.handler;

import com.example.lab.db.api.dto.exception.ExceptionResponse;
import com.example.lab.db.api.enums.ErrorCode;
import com.example.lab.db.api.exception.ApiException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<?> handleApiException(ApiException e, HttpServletRequest request) {
        return ResponseEntity.status(e.getStatus()).body(buildExceptionResponse(e, request.getRequestURI()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception e, HttpServletRequest request) {
        log.error(e.getMessage(), e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                buildExceptionResponse(ErrorCode.ERR_UNKNOWN_CODE, e.getMessage(), request.getRequestURI()));
    }

    private ExceptionResponse buildExceptionResponse(ApiException e, String uri) {
        return buildExceptionResponse(e.getErrorCode(), e.getMessage(), uri);
    }

    private ExceptionResponse buildExceptionResponse(ErrorCode errorCode, String message, String uri) {
        return new ExceptionResponse(LocalDateTime.now(), errorCode, message, uri);
    }
}
