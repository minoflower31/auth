package com.example.login.api;

import com.example.login.application.MemberService;
import com.example.login.dto.request.CreateMemberRequest;
import com.example.login.global.util.response.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/login")
    public CommonResponse<Void> login() {
        return null;
    }

    @PostMapping("/sign-up")
    public CommonResponse<Void> signUp(@RequestBody CreateMemberRequest request) {
        memberService.save(request.loginId(), request.password());
        return CommonResponse.success();
    }
}
