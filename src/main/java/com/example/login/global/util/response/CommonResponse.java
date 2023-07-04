package com.example.login.global.util.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class CommonResponse<T> {

    private String code;
    private String message;
    private T data;

    private CommonResponse() {

    }

    public CommonResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResponse(String code, String message, T data) {
        this(code, message);
        this.data = data;
    }

    public static CommonResponse<Void> success() {
        return new CommonResponse<>("200", "success");
    }

    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>("200", "success", data);
    }

    public static CommonResponse<Void> fail(String code, String message) {
        return new CommonResponse<>(code, message);
    }
}
