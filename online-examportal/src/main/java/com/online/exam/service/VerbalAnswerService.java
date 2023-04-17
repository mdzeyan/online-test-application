package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.VerbalAnswer;
import com.online.exam.entity.VerbalQuestion;
import com.online.exam.repo.VerbalQuestionRepository;


@Service
public class VerbalAnswerService {
	
	@Autowired
	VerbalQuestionRepository verbalQsnRepo;
	
	
	public List<VerbalQuestion> getAllQsn() throws Exception{
		List<VerbalQuestion> questions = new ArrayList<VerbalQuestion>();
		
		questions = verbalQsnRepo.findAll();
		
		return questions;
	}
	
	public int findAnswerIdCorrect(int questionId)
	{
		VerbalQuestion question = verbalQsnRepo.findById(questionId).get();
		for(VerbalAnswer answer : question.getQanswers())
		{
			if(answer.isAcorrect())
			{
				return answer.getAid();
			}
		}
		return -1;
	}

}
