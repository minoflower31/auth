package com.example.login.dto.request;

public record CreateMemberRequest(
        String loginId,
        String password
) {
}
