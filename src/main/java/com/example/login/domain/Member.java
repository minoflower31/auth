package com.example.login.domain;

import com.example.login.global.enums.MemberRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId;

    private String password;

    @Enumerated(EnumType.STRING)
    private MemberRole role;

    public Member(String loginId, String password, MemberRole role) {
        this.loginId = loginId;
        this.password = password;
        this.role = role;
    }
}
