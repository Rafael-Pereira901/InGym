package com.lad_corp.ingym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lad_corp.ingym.entity.User;
import com.lad_corp.ingym.service.UserService;

@RestController
@RequestMapping(value="/api/users")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUserById() {
		return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserByid(@PathVariable(name ="id") String id){
		return new ResponseEntity<>(userService.getUserByid(id),HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updatePost( @RequestBody User user, @PathVariable(name="id") String id){
		return new ResponseEntity<User>(userService.updateUser(user, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePost(@PathVariable(name="id") String id){
		userService.getUserByid(id);
		return new ResponseEntity<String>("User deleted sucessfully.", HttpStatus.OK);
	}
	
}
