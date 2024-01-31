package com.khit.entity;

import com.khit.entity.Member;

import java.util.List;

import com.khit.entity.Role;
import com.khit.entity.BaseEntity;
import com.khit.dto.MemberDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Setter
@Getter
@Table(name = "tbl_member")
@Entity
public class Member extends BaseEntity{
	
	@Id  //PK(기본키)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  //회원번호
	
	@Column(unique = true)
	private String memberId;  //아이디
	
	@Column(nullable = false)  //필수 입력, not null
	private String memberPassword;	
	
	@Column(length = 30, nullable = false)  //길이 30byte
	private String memberName;
	
	@Column(unique = true)  //유일성 가짐, 중복검사
	private String memberEmail;
	
	@Column
	private int memberAge;
	
	@Column
	private String memberArea;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	//dto를 매개로 받아서 entity에 저장하는 정적 메서드 생성
	public static Member toSaveEntity(MemberDTO memberDTO) {
		//builder()로 생성
		Member member = Member.builder()
				//.id(memberDTO.getId())
				.memberId(memberDTO.getMemberId())
				.memberPassword(memberDTO.getMemberPassword())
				.memberName(memberDTO.getMemberName())
				.memberEmail(memberDTO.getMemberEmail())
				.memberAge(memberDTO.getMemberAge())
				.memberArea(memberDTO.getMemberArea())
				.role(memberDTO.getRole())
				.build();
		
		return member;
	}
	
	public static Member toSaveUpdate(MemberDTO memberDTO) {
		Member member = Member.builder()
				.id(memberDTO.getId())
				.memberId(memberDTO.getMemberId())
				.memberPassword(memberDTO.getMemberPassword())
				.memberName(memberDTO.getMemberName())
				.memberEmail(memberDTO.getMemberEmail())
				.memberAge(memberDTO.getMemberAge())
				.memberArea(memberDTO.getMemberArea())
				.role(memberDTO.getRole())
				.build();
		
		return member;
	}




}
