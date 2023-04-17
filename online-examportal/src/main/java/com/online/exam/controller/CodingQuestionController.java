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


import com.online.exam.entity.CodingAnswer;
import com.online.exam.entity.CodingQuestion;
import com.online.exam.service.CodingQuestionService;

@Controller
public class CodingQuestionController {
	
	@Autowired
	CodingQuestionService codeQsnServ;
	
	@RequestMapping("add-code-quiz")
	public String addCodeQuiz()
	{
		return "add-coding-quiz";
	}
	
	
	@RequestMapping(value = "addCodingQuestion", method = RequestMethod.GET) 
	public ModelAndView insertAptiQuestion(HttpServletRequest req) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		CodingQuestion codeQuestion = new CodingQuestion();
		String qsn = req.getParameter("question");
		codeQuestion.setQcontent(qsn);
		
		CodingAnswer answer1 = new CodingAnswer();
		String ans1 = req.getParameter("answer1");
		boolean iscorrect1 = Boolean.parseBoolean(req.getParameter("isCorrect1"));
		
		answer1.setAcontent(ans1);
		answer1.setAcorrect(iscorrect1);
		answer1.setAquestion(codeQuestion);
		
		CodingAnswer answer2 = new CodingAnswer();
		String ans2 = req.getParameter("answer2");
		boolean iscorrect2 = Boolean.parseBoolean(req.getParameter("isCorrect2"));
		
		answer2.setAcontent(ans2);
		answer2.setAcorrect(iscorrect2);
		answer2.setAquestion(codeQuestion);
		
		CodingAnswer answer3 = new CodingAnswer();
		String ans3 = req.getParameter("answer3");
		boolean iscorrect3 = Boolean.parseBoolean(req.getParameter("isCorrect3"));
		
		answer3.setAcontent(ans3);
		answer3.setAcorrect(iscorrect3);
		answer3.setAquestion(codeQuestion);
		
		List<CodingAnswer> answers = new ArrayList<CodingAnswer>();
		answers.add(answer1);
		answers.add(answer2);
		answers.add(answer3);
		
		codeQuestion.setQanswers(answers);
		
		if(codeQuestion != null)
		{
			codeQsnServ.insertCodeQuestion(codeQuestion);
		}
		
		mv.addObject("obj", qsn);
		mv.setViewName("success-add-code");
		
		return mv;
	}
	
	
	@RequestMapping("show-code-quiz")
	public String showAllCodeQuiz(HttpServletRequest req) throws Exception
	{
		List<CodingQuestion> codeQuestions = new ArrayList<CodingQuestion>();
		
		codeQuestions = codeQsnServ.showAllCodingQuestion();
		
		HttpSession session = req.getSession();
		
		session.setAttribute("session", codeQuestions);
		
		
		return "show-coding-quiz";
	}
	
	@RequestMapping("delete-code-quiz")
	public String deleteAllCodeQuiz()
	{
		return "delete-coding-quiz";
	}

}
