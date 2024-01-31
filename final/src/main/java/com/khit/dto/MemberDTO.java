package com.khit.dto;

import java.sql.Timestamp;

import com.khit.entity.Member;
import com.khit.entity.Role;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MemberDTO {

	private Integer id;
	
	//아이디는 4자~20자로 입력
	@Size(min=4, max=20)
	@NotEmpty(message = "사용자 ID는 필수 항목입니다.")
	private String memberId;
	
	@NotEmpty(message = "비밀번호는 필수 항목입니다.")
	private String memberPassword;
	
	@NotEmpty(message = "이름은 필수 항목입니다.")
	private String memberName;
	
	private String memberEmail;
	
	private int memberAge;
	
	private String memberArea;
	
	private Role role;
	
	private Timestamp createdDate;
	
	private Timestamp updatedDate;
	
	//entity를 dto로 변환하는 메서드
	public static MemberDTO toSaveDTO(Member member) {
		
		MemberDTO memberDTO = MemberDTO.builder()
				.id(member.getId())
				.memberId(member.getMemberId())
				.memberPassword(member.getMemberPassword())
				.memberName(member.getMemberName())
				.memberEmail(member.getMemberEmail())
				.memberAge(member.getMemberAge())
				.memberArea(member.getMemberArea())
				.createdDate(member.getCreatedDate())
				.updatedDate(member.getUpdatedDate())
				.build();
				
		return memberDTO;
	}
}
