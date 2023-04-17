package com.online.exam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.online.exam.entity.User;
import com.online.exam.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userServ;
	
	@RequestMapping(value = "addUser", method = RequestMethod.POST) 
	ModelAndView createUser(User user, HttpServletRequest req) throws Exception{
		
		boolean  status = false;
		ModelAndView mv = new ModelAndView();
		HttpSession httpSession = req.getSession();
		
		if(user.getGender() != null)
		{
			if(userServ.getUserByEmail(user.getUserEmail()) != null)
			{
				httpSession.setAttribute("msg2", "User Email is already Exist try with different Email");
				mv.setViewName("registration");
				return mv;
			}
			else
			{
				status = userServ.insertUser(user);
				httpSession.setAttribute("msg", "User is Registerd Successfully");
				
				System.out.println("User Registerd Successfully");
				mv.setViewName("registration");
				return mv;
			}
			
		}
		else {
			
			httpSession.setAttribute("msg1", "Please fill the form");
			mv.setViewName("registration");
			return mv;
		}
		
		
	}
	
	@RequestMapping(value = "loginUser", method = RequestMethod.POST)
	ModelAndView loginUser(User user, HttpServletRequest req) throws Exception{
		User userBknd = new User();
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		String userEmail = "amir.khusru8935@gmail.com";
		userBknd = userServ.getUserByEmailAndPassword(user.getUserEmail(), user.getUserPassword());
		
		if(user.getUserEmail().equals(userEmail) && userBknd != null)
		{
			session.setAttribute("session", user);
			mv.addObject("obj", userBknd);
			mv.setViewName("adminUserProfile");
			return mv;
		}
		
		else
		{
			if(userBknd != null)
			{
				session.setAttribute("session", user);
				mv.addObject("obj", userBknd);
				mv.setViewName("normalUserProfile");
				return mv;
			}
			else
			{
				session.setAttribute("msg", "Invalid User or Password Try again!");
				mv.setViewName("login");
				return mv;
			}
		}
		
	}
	
	@RequestMapping("userLogout")
	ModelAndView logoutUser(HttpServletRequest req, HttpServletResponse res) throws Exception{
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		
		session.removeAttribute("session");
		mv.setViewName("login");
		
		return mv;
	}
	
	

}
