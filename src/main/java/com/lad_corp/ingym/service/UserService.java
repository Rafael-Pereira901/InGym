package com.lad_corp.ingym.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.lad_corp.ingym.entity.User;
import com.lad_corp.ingym.payload.UserDTO;
import com.lad_corp.ingym.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	private ModelMapper mapper;
	
	public UserService(UserRepository userRepository, ModelMapper mapper) {
		this.userRepository = userRepository;
		this.mapper = mapper;
	}
	
	public UserDTO createUser(UserDTO userDto) {
		User user = mapToEntity(userDto);
		userRepository.save(user);
		UserDTO newUser = mapToDTO(user);
		return newUser;
	}
	
	public List<UserDTO> getAllUsers() {
		List<User> users = userRepository.findAll();
		List<UserDTO> usersDTO = users.stream().map(user -> mapToDTO(user)).collect(Collectors.toList());
		return usersDTO;
	}

	public UserDTO getUserByid(Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalide user id!"));
		return mapToDTO(user);
	}

	public UserDTO updateUser(UserDTO userDto, Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalide user id!"));
		user.setUsername(userDto.getUsername());
		user.setEmail(userDto.getEmail());
		return mapToDTO(userRepository.save(user)); 
	}

	public void deleteUserById(Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalide user id!"));
		userRepository.delete(user);
	}
	
	private UserDTO mapToDTO(User user) {
		return mapper.map(user, UserDTO.class);
	}

	private User mapToEntity(UserDTO dto) {
		return mapper.map(dto, User.class);
	}
	
}
