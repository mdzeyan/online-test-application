package com.online.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.exam.entity.User;
import com.online.exam.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public boolean insertUser(User user) throws Exception{
		boolean status = false;
		
		if(user != null)
		{
			userRepo.save(user);
			status = true;
		}
		
		return status;
	}
	
	public User getUserByName(String name) throws Exception{
		User user = new User();
		if(user != null)
		{
			user = userRepo.findByuserName(name);
		}
		
		return user;
	}
	
	public User getUserByEmail(String email) throws Exception{
		User user = new User();
		if(user != null)
		{
			user = userRepo.findByuserEmail(email);
		}
		
		return user;
	}
	
	public User getUserByEmailAndPassword(String email, String password) throws Exception{
		User user = new User();
		if(user != null)
		{
			user = userRepo.findByUserEmailAndUserPassword(email, password);
		}
		
		return user;
	}

}
