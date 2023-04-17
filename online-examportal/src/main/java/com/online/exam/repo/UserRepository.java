package com.online.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	public User findByuserName(String name);
	public User findByuserEmail(String email);
	public User findByUserEmailAndUserPassword(String email, String password);
	
	public void deleteByUserEmail(String email);

}
