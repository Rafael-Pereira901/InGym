package com.lad_corp.ingym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lad_corp.ingym.entity.User;
import com.lad_corp.ingym.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	@Autowired 
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User createUser(User user) {
		userRepository.save(user);
		return user;
	}

	
}
