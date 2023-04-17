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

import com.online.exam.entity.VerbalAnswer;
import com.online.exam.entity.VerbalQuestion;
import com.online.exam.service.VerbalQuestionService;

@Controller
public class VerbalQuestionController {
	
	@Autowired
	VerbalQuestionService verbalQsnServ;
	
	@RequestMapping("add-verbal-quiz")
	public String addVerbalQuiz()
	{
		return "add-verbal-quiz";
	}
	
	
	@RequestMapping(value = "addVerbalQuestion", method = RequestMethod.GET) 
	public ModelAndView insertAptiQuestion(HttpServletRequest req) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		VerbalQuestion verbalQuestion = new VerbalQuestion();
		String qsn = req.getParameter("question");
		verbalQuestion.setQcontent(qsn);
		
		VerbalAnswer answer1 = new VerbalAnswer();
		String ans1 = req.getParameter("answer1");
		boolean iscorrect1 = Boolean.parseBoolean(req.getParameter("isCorrect1"));
		
		answer1.setAcontent(ans1);
		answer1.setAcorrect(iscorrect1);
		answer1.setAquestion(verbalQuestion);
		
		VerbalAnswer answer2 = new VerbalAnswer();
		String ans2 = req.getParameter("answer2");
		boolean iscorrect2 = Boolean.parseBoolean(req.getParameter("isCorrect2"));
		
		answer2.setAcontent(ans2);
		answer2.setAcorrect(iscorrect2);
		answer2.setAquestion(verbalQuestion);
		
		VerbalAnswer answer3 = new VerbalAnswer();
		String ans3 = req.getParameter("answer3");
		boolean iscorrect3 = Boolean.parseBoolean(req.getParameter("isCorrect3"));
		
		answer3.setAcontent(ans3);
		answer3.setAcorrect(iscorrect3);
		answer3.setAquestion(verbalQuestion);
		
		List<VerbalAnswer> answers = new ArrayList<VerbalAnswer>();
		answers.add(answer1);
		answers.add(answer2);
		answers.add(answer3);
		
		verbalQuestion.setQanswers(answers);
		
		if(verbalQuestion != null)
		{
			verbalQsnServ.insertVerbalQuestion(verbalQuestion);
		}
		
		mv.addObject("obj", qsn);
		mv.setViewName("success-add-verbal");
		
		return mv;
	}
	
	@RequestMapping("show-verb-quiz")
	public String showVerbalQuiz(HttpServletRequest req) throws Exception{
		List<VerbalQuestion> verbalQuestions = new ArrayList<VerbalQuestion>();
		
		verbalQuestions = verbalQsnServ.findAllVerbalQuestion();
		
		HttpSession session = req.getSession();
		
		session.setAttribute("session", verbalQuestions);
		return "show-verbal-quiz";
	}
	
	@RequestMapping("delete-verbal-quiz")
	public String deleteVerbalQuiz()
	{
		return "delete-verbal-quiz";
	}

}
