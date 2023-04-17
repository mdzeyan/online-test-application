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

import com.online.exam.entity.AptiQuestion;
import com.online.exam.service.AptiAnswerService;

@Controller
public class AptiAnswerController {
	
	@Autowired
	AptiAnswerService aptAnsServ;
	
	@RequestMapping("onAptiQuiz")
	ModelAndView onGoingAptiQuiz(HttpServletRequest req) throws Exception
	{
		ModelAndView mv = new ModelAndView();
		List<AptiQuestion> questions = new ArrayList<AptiQuestion>();
		HttpSession session =  req.getSession();
		
		questions = aptAnsServ.getAllQsn();
		
		session.setAttribute("objs", questions);
		mv.setViewName("onAptiQuiz");
		
		return mv;
	}
	
	@RequestMapping(value = "showAptiResult", method = RequestMethod.POST)
	String resultShow(HttpServletRequest req)
	{
		int score = 0;
		String[] questionIds = req.getParameterValues("questionId");
		
		for(String questionId : questionIds)
		{
			int answerIdCorrect = aptAnsServ.findAnswerIdCorrect(Integer.parseInt(questionId));
			if(answerIdCorrect == Integer.parseInt(req.getParameter("question_"+questionId)))
			{
				score++;
			}
		}
		
		req.setAttribute("obj", score);
		
		return "apti-result";
	}

}
