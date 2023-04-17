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

import com.online.exam.entity.AptiAnswer;
import com.online.exam.entity.AptiQuestion;
import com.online.exam.service.AptiQuestionService;



@Controller
public class AptiQuestionController {
	
	@Autowired
	AptiQuestionService aptiQsnServ;
	
	@RequestMapping("add-apt-quiz")
	public String addAptiQuiz()
	{
		return "add-aptitude-quiz";
	}
	
	
	@RequestMapping(value = "addAptiQuestion", method = RequestMethod.GET) 
	public ModelAndView insertAptiQuestion(HttpServletRequest req) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		AptiQuestion aptiQuestion = new AptiQuestion();
		String qsn = req.getParameter("question");
		aptiQuestion.setQcontent(qsn);
		
		AptiAnswer answer1 = new AptiAnswer();
		String ans1 = req.getParameter("answer1");
		boolean iscorrect1 = Boolean.parseBoolean(req.getParameter("isCorrect1"));
		
		answer1.setAcontent(ans1);
		answer1.setAcorrect(iscorrect1);
		answer1.setAquestion(aptiQuestion);
		
		AptiAnswer answer2 = new AptiAnswer();
		String ans2 = req.getParameter("answer2");
		boolean iscorrect2 = Boolean.parseBoolean(req.getParameter("isCorrect2"));
		
		answer2.setAcontent(ans2);
		answer2.setAcorrect(iscorrect2);
		answer2.setAquestion(aptiQuestion);
		
		AptiAnswer answer3 = new AptiAnswer();
		String ans3 = req.getParameter("answer3");
		boolean iscorrect3 = Boolean.parseBoolean(req.getParameter("isCorrect3"));
		
		answer3.setAcontent(ans3);
		answer3.setAcorrect(iscorrect3);
		answer3.setAquestion(aptiQuestion);
		
		List<AptiAnswer> answers = new ArrayList<AptiAnswer>();
		answers.add(answer1);
		answers.add(answer2);
		answers.add(answer3);
		
		aptiQuestion.setQanswers(answers);
		
		if(aptiQuestion != null)
		{
			aptiQsnServ.insertAptiQuestion(aptiQuestion);
		}
		
		mv.addObject("obj", qsn);
		mv.setViewName("success-add-apti");
		
		return mv;
	}
	
	
	
	
	@RequestMapping("show-apt-quiz")
	String showAllQuestion(HttpServletRequest req) throws Exception{
		List<AptiQuestion> aptiQuestions = new ArrayList<AptiQuestion>();
		
		aptiQuestions = aptiQsnServ.showAllAptiQuestion();
		
		HttpSession session = req.getSession();
		
		session.setAttribute("session", aptiQuestions);
		
		return "show-aptitude-quiz";
	}
	
	
	
	@RequestMapping("delete-apt-quiz")
	String deleteAllQuestions() throws Exception{
		aptiQsnServ.deleteAllQuestions();
		return "delete-aptitude-quiz";
	}

}
