package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.VerbalQuestion;
import com.online.exam.repo.VerbalQuestionRepository;

@Service
public class VerbalQuestionService {
	
	@Autowired
	VerbalQuestionRepository verbalQsnRepo;
	
	
//	To Save Question
	public boolean insertVerbalQuestion(VerbalQuestion verbalQsn) throws Exception{
		boolean status = false;
		
		if(verbalQsn != null)
		{
			verbalQsnRepo.save(verbalQsn);
			status = true;
		}
		
		return status;
	}
	
	
//	To Find a Question
	public VerbalQuestion findVerbalQuestionById(int qId) throws Exception{
		VerbalQuestion verbalQuestion = new VerbalQuestion();
		if(qId != 0)
		{
			verbalQuestion = verbalQsnRepo.findById(qId).get();
		}
		
		
		return verbalQuestion;
	}
	
//	To Find all Question
	public List<VerbalQuestion> findAllVerbalQuestion() throws Exception{
		List<VerbalQuestion> verbalQuestions = new ArrayList<VerbalQuestion>();
		
		verbalQuestions = verbalQsnRepo.findAll();
		
		return verbalQuestions;
	}
	
//	To delete a Question
	public boolean eraseQuestionById(int qId) throws Exception{
		boolean status = false;
		
		if(qId != 0)
		{
			verbalQsnRepo.deleteById(qId);
			status = true;
		}
		
		return status;
	}
	
	
	
	
	
	
	
	
	
	

}
