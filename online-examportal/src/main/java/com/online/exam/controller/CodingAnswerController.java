package com.online.exam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.online.exam.entity.CodingQuestion;
import com.online.exam.service.CodingAnswerService;

@Controller
public class CodingAnswerController {
	
	@Autowired
	CodingAnswerService codingAnsServ;
	
	@RequestMapping("onCodingQuiz")
	ModelAndView onGoingCodingQuiz(HttpServletRequest req) throws Exception
	{
		ModelAndView mv = new ModelAndView();
		List<CodingQuestion> questions = new ArrayList<CodingQuestion>();
		HttpSession session =  req.getSession();
		
		questions = codingAnsServ.getAllQsn();
		
		session.setAttribute("objs", questions);
		mv.setViewName("onCodingQuiz");
		
		return mv;
	}
	
	@RequestMapping(value = "showCodingResult", method = RequestMethod.POST)
	String resultShow(HttpServletRequest req)
	{
		int score = 0;
		String[] questionIds = req.getParameterValues("questionId");
		
		for(String questionId : questionIds)
		{
			int answerIdCorrect = codingAnsServ.findAnswerIdCorrect(Integer.parseInt(questionId));
			if(answerIdCorrect == Integer.parseInt(req.getParameter("question_"+questionId)))
			{
				score++;
			}
		}
		
		req.setAttribute("session", score);
		
		return "coding-result";
	}

}
