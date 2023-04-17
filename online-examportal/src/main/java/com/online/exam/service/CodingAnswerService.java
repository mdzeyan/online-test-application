package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.CodingAnswer;
import com.online.exam.entity.CodingQuestion;
import com.online.exam.repo.CodingQuestionRepository;

@Service
public class CodingAnswerService {
	
	@Autowired
	CodingQuestionRepository codingQsnRepo;
	
	
	public List<CodingQuestion> getAllQsn() throws Exception{
		List<CodingQuestion> questions = new ArrayList<CodingQuestion>();
		
		questions = codingQsnRepo.findAll();
		
		return questions;
	}
	
	public int findAnswerIdCorrect(int questionId)
	{
		CodingQuestion question = codingQsnRepo.findById(questionId).get();
		for(CodingAnswer answer : question.getQanswers())
		{
			if(answer.isAcorrect())
			{
				return answer.getAid();
			}
		}
		return -1;
	}

}
