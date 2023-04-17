package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.AptiQuestion;
import com.online.exam.repo.AptiQuestionRepository;


@Service
public class AptiQuestionService {
	
	@Autowired
	AptiQuestionRepository aptiQsnRepo;
	
	
	
	public boolean insertAptiQuestion(AptiQuestion AptiQsn) throws Exception{
		boolean status = false;
		if(AptiQsn != null)
		{
			aptiQsnRepo.save(AptiQsn);
			status = true;
		}
		
		
		return status;
	}
	
	
	public List<AptiQuestion> showAllAptiQuestion() throws Exception{
		List<AptiQuestion> aptiQuestions = new ArrayList<AptiQuestion>();
		
		aptiQuestions = aptiQsnRepo.findAll();
		
		return aptiQuestions;
	}
	
	
	public void deleteAllQuestions() throws Exception{
		
		aptiQsnRepo.deleteAll();
		
	}

}
