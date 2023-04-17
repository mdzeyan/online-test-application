package com.online.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.CodingQuestion;
import com.online.exam.repo.CodingQuestionRepository;

@Service
public class CodingQuestionService {
	
	@Autowired
	CodingQuestionRepository codeQsnRepo;
	
	
	
	public boolean insertCodeQuestion(CodingQuestion CodingQsn) throws Exception{
		boolean status = false;
		if(CodingQsn != null)
		{
			codeQsnRepo.save(CodingQsn);
			status = true;
		}
		
		
		return status;
	}
	
	public List<CodingQuestion> showAllCodingQuestion() throws Exception{
		List<CodingQuestion> codeQuestions = new ArrayList<CodingQuestion>();
		
		codeQuestions = codeQsnRepo.findAll();
		
		return codeQuestions;
	}

}
