package com.example.login.infra.repository;

import com.example.login.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberRepository extends JpaRepository<Member, Long> {
}
