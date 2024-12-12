package com.example.lab.db.api.exception;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class LogExceptionWrapper {

    public static <T extends Exception> T logErrorException(T exception) {
        log.error(exception.getMessage());
        return exception;
    }
}
