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
import com.online.exam.entity.VerbalQuestion;
import com.online.exam.service.CodingAnswerService;
import com.online.exam.service.VerbalAnswerService;

@Controller
public class VerbalAnswerController {
	
	@Autowired
	VerbalAnswerService verbalAnsServ;
	
	@RequestMapping("onVerbalQuiz")
	ModelAndView onGoingAptiQuiz(HttpServletRequest req) throws Exception
	{
		ModelAndView mv = new ModelAndView();
		List<VerbalQuestion> questions = new ArrayList<VerbalQuestion>();
		HttpSession session =  req.getSession();
		
		questions = verbalAnsServ.getAllQsn();
		
		session.setAttribute("objs", questions);
		mv.setViewName("onVerbalQuiz");
		
		return mv;
	}
	
	@RequestMapping(value = "showVerbalResult", method = RequestMethod.POST)
	String resultShow(HttpServletRequest req)
	{
		int score = 0;
		String[] questionIds = req.getParameterValues("questionId");
		
		for(String questionId : questionIds)
		{
			int answerIdCorrect = verbalAnsServ.findAnswerIdCorrect(Integer.parseInt(questionId));
			if(answerIdCorrect == Integer.parseInt(req.getParameter("question_"+questionId)))
			{
				score++;
			}
		}
		
		req.setAttribute("obj", score);
		
		return "verbal-result";
	}

}
