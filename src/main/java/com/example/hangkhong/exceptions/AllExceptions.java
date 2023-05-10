package com.example.hangkhong.exceptions;

import org.springframework.http.HttpStatus;

public class AllExceptions {

    private static final String MAYBAY_NOT_FOUND_KEY = "MAYBAY_NOT_FOUND";
    private static final String MAYBAY_NOT_FOUND_MSG = "Mã máy bay không tồn tại";

    public static ResponseException notFound(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.NOT_FOUND);
    }

    public static ResponseException badRequest(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.BAD_REQUEST);
    }

    public static ResponseException internalServerError(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static ResponseException MayBayNotFound() {
        return notFound(MAYBAY_NOT_FOUND_KEY, MAYBAY_NOT_FOUND_MSG);
    }

}
