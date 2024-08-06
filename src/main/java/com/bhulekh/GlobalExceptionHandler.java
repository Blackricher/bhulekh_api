package com.bhulekh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception e) {
        // Log the complete stack trace
        logger.error("Exception occurred", e);

        // Return a meaningful error response in JSON format
        String errorMessage = (e.getMessage() != null) ? e.getMessage() : "No specific error message";
        String errorResponse = "{\"error\": \"Unexpected error\", \"details\": \"" + errorMessage + "\"}";

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(errorResponse);
    }
}
