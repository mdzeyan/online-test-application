package com.online.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.entity.AptiQuestion;

public interface AptiQuestionRepository extends JpaRepository<AptiQuestion,Integer> {
	

}
