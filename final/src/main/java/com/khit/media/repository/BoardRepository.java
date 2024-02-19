package com.khit.media.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khit.media.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}
