package com.example.login.application;

import com.example.login.domain.Member;
import com.example.login.infra.repository.JpaMemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MemberService {

    private final JpaMemberRepository memberRepository;

    public MemberService(JpaMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(String loginId, String password) {
        Member member = new Member(loginId, password);
        memberRepository.save(member);
    }
}
