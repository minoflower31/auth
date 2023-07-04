package com.example.login.global.util.error;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum CommonError {

    NOT_FOUND_MEMBER("404", "해당 회원을 찾을 수 없습니다.");

    private String code;
    private String message;

    CommonError(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
