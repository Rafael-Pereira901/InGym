package com.lad_corp.ingym.service;

import java.util.List;

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
	
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	public User getUserByid(String id) {
		User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalide user id!"));
		return user;
	}

	public User updateUser(User updatedUser, String id) {
		User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalide user id!"));
		user.setUsername(updatedUser.getUsername());
		user.setEmail(updatedUser.getEmail());
		user.setUtilInfo(updatedUser.getUtilInfo());
		return userRepository.save(user);
	}

	public void deleteUserById(String id) {
		User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalide user id!"));
		userRepository.delete(user);
	}

	
}
