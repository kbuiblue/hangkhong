package com.example.hangkhong.exceptions;

import org.springframework.http.HttpStatus;

public class AllExceptions {
    private static final String MAYBAY_NOT_FOUND_KEY = "MAYBAY_NOT_FOUND";
    private static final String MAYBAY_NOT_FOUND_MSG = "Mã máy bay không tồn tại";

    private static final String NHAN_VIEN_NOT_FOUND_KEY = "NHAN_VIEN_NOT_FOUND";
    private static final String NHAN_VIEN_NOT_FOUND_MSG = "Mã nhân viên không tồn tại";

    private static final String LUONG_NHAN_VIEN_NOT_FOUND_KEY = "LUONG_NHAN_VIEN_NOT_FOUND";
    private static final String LUONG_NHAN_VIEN_NOT_FOUND_MSG = "Nhân viên hơn mức lương này không tồn tại";

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

    public static ResponseException NhanVienNotFound() {
        return notFound(NHAN_VIEN_NOT_FOUND_KEY, NHAN_VIEN_NOT_FOUND_MSG);
    }

    public static ResponseException LuongNhanVienNotFound() {
        return notFound(LUONG_NHAN_VIEN_NOT_FOUND_KEY, LUONG_NHAN_VIEN_NOT_FOUND_MSG);
    }

    public static ResponseException InvalidInput() {
        return badRequest("INVALID_INPUT", "Dữ liệu không hợp lệ");
    }
}
