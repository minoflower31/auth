package com.example.login.application;

import com.example.login.infra.repository.JpaMemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final JpaMemberRepository memberRepository;

    public MemberService(JpaMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


}
