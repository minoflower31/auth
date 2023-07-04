package com.example.login.global.util.exception;

import com.example.login.global.util.response.CommonResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandler {

    public CommonResponse<Void> exception(CommonException e) {
        return new CommonResponse<>(e.getCode(), e.getMessage());
    }
}
