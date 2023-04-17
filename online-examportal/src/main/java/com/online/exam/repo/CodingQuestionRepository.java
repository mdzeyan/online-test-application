package com.online.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.entity.CodingQuestion;

public interface CodingQuestionRepository extends JpaRepository<CodingQuestion,Integer> {

}
