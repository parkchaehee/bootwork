package com.khit.media.unittest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.khit.media.entity.Member;
import com.khit.media.entity.Role;
import com.khit.media.repository.MemberRepository;

@SpringBootTest
public class PasswordEncoderTest {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private PasswordEncoder pwEncoder;
	
	/*
	 * @Test public void testInsertData() { //일반 회원 - 저장 Member member = new
	 * Member(); member.setMemberId("chae1");
	 * member.setPassword(pwEncoder.encode("1")); member.setName("박하나1");
	 * member.setMemberEmail("chaeh1@naver.com"); member.setMemberAge("990202");
	 * member.setMnumber("11"); member.setMemberArea("인천");
	 * member.setRole(Role.ADMIN);
	 * 
	 * memberRepository.save(member); }
	 */
}
