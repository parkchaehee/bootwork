package com.khit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khit.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{
    //Optional<Member> findByMemberEmail(String memberEmail);
	Optional<Member> findByMemberId(String string);


}
