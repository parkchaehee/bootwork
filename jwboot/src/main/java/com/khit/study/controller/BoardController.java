package com.khit.study.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khit.study.entity.BoardVO;
import com.khit.study.service.BoardService;

import lombok.AllArgsConstructor;

//문자열을 반환하는 어노테이션
//@ResponseBody, @ResponseEntity와 비슷(메소드에사용)


@AllArgsConstructor
@RestController // 객체를 문자열로 변환하는 클래스
public class BoardController {
	
	private BoardService boardService;
	
	@GetMapping("/greeting")
	public String sayHello(String name) {
		return "hello~" + name; //@RestController > 문자열(파일X)
	}
	
	//객체 데이터를 브라우저에 보내줌
	//상세보기
	@GetMapping("/board/detail")
	public BoardVO getBoard() {
		BoardVO board = boardService.getBoard();
		return board;
	}
	
	@GetMapping("/board/list")
	public List<BoardVO> getBoardList(){
		List<BoardVO> getBoardList = boardService.getBoardList();
		return getBoardList;
	}
	
}
