package com.khit.dto;

import com.khit.entity.Member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MemberDTO {

	private Long id;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	
	//entity를 dto로 변환하는 메서드
	public static MemberDTO toSaveDTO(Member member) {
		
		MemberDTO memberDTO = MemberDTO.builder()
				.id(member.getId())
				.memberEmail(member.getMemberEmail())
				.memberPassword(member.getMemberPassword())
				.memberName(member.getMemberName())
				.memberAge(member.getMemberAge())
				.build();
				
		return memberDTO;
	}
}
