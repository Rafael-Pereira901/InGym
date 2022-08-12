package com.lad_corp.ingym.service;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.lad_corp.ingym.entity.Workout;
import com.lad_corp.ingym.repository.UserRepository;
import com.lad_corp.ingym.repository.WorkoutRepository;

public class WorkoutService {

	private WorkoutRepository workoutRepository;
	private UserRepository userRepository;
	private ModelMapper mapper;
	
	public WorkoutService(WorkoutRepository workoutRepository, UserRepository userRepository, ModelMapper mapper) {
		this.workoutRepository = workoutRepository;
		this.userRepository = userRepository;
		this.mapper = mapper;
	}

	public Workout createWorkout(long userId, Workout workout) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Workout> getWorkoutsByUserID(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Workout getWorkoutById(Long userId, Long workoutId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteWorkout(Long userId, Long workoutId) {
		// TODO Auto-generated method stub
		
	}

	public Workout updateWorkout(long userId, long workoutId, Workout workout) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
