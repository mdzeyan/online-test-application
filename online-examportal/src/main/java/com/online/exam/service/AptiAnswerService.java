package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.AptiAnswer;
import com.online.exam.entity.AptiQuestion;
import com.online.exam.repo.AptiQuestionRepository;


@Service
public class AptiAnswerService {
	
	@Autowired
	AptiQuestionRepository aptiQsnRepo;
	
	
	public List<AptiQuestion> getAllQsn() throws Exception{
		List<AptiQuestion> questions = new ArrayList<AptiQuestion>();
		
		questions = aptiQsnRepo.findAll();
		
		return questions;
	}
	
	public int findAnswerIdCorrect(int questionId)
	{
		AptiQuestion question = aptiQsnRepo.findById(questionId).get();
		for(AptiAnswer answer : question.getQanswers())
		{
			if(answer.isAcorrect())
			{
				return answer.getAid();
			}
		}
		return -1;
	}

}
