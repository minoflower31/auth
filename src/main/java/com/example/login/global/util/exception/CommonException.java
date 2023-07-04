package com.example.login.global.util.exception;

import com.example.login.global.util.error.CommonError;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommonException extends RuntimeException {

    private String code;
    private String message;

    public CommonException(CommonError error) {
        this.code = error.getCode();
        this.message = error.getMessage();
    }
}
