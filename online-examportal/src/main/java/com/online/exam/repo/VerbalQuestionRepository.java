package com.online.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.entity.VerbalQuestion;

public interface VerbalQuestionRepository extends JpaRepository<VerbalQuestion,Integer> {

}
