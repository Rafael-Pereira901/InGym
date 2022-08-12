package com.lad_corp.ingym.controller;

import java.util.List;

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

import com.lad_corp.ingym.entity.Workout;
import com.lad_corp.ingym.service.WorkoutService;

@RestController
@RequestMapping(value="/api/")
public class WorkoutController {

	private WorkoutService workoutService;
	
	public WorkoutController(WorkoutService workoutService) {
		this.workoutService = workoutService;
	}

	@PostMapping("/users/{userId}/workouts")
	public ResponseEntity<Workout> createWorkout(@PathVariable  (value = "userId") long userId, @RequestBody Workout workout){
		return new ResponseEntity<Workout>(workoutService.createWorkout(userId, workout),HttpStatus.CREATED);
	}
	
	@GetMapping("/users/{userId}/workouts")
	public ResponseEntity<List<Workout>> getWorkoutsByUserID(@PathVariable(value = "userId") long userId){
		return new ResponseEntity<List<Workout>>(workoutService.getWorkoutsByUserID(userId),HttpStatus.CREATED);
	}
	
	@GetMapping("/users/{userId}/workouts/{id}")
	public ResponseEntity<Workout> getWorkoutById(
			@PathVariable(name = "userId")  Long userId, 
			@PathVariable(name = "id") Long workoutId)
	{
		Workout workout = workoutService.getWorkoutById(userId, workoutId);
		return new ResponseEntity<Workout>(workout, HttpStatus.OK);
	}
	
	@DeleteMapping("/users/{userId}/workouts/{id}")
	public ResponseEntity<String> deleteWorkout(
			@PathVariable(name = "userId")  Long userId, 
			@PathVariable(name = "id") Long workoutId)
	{
		workoutService.deleteWorkout(userId, workoutId);
		return new ResponseEntity<String>("Workout deleted sucessfully!",HttpStatus.OK);
	}
	
	@PutMapping("/users/{userId}/workouts/{id}")
	public ResponseEntity<Workout> updateComment(
			@PathVariable(name = "userId") long userId,
			@PathVariable(name = "id") long workoutId, 
			@RequestBody Workout workout)
	{
		Workout updatedWorkout = workoutService.updateWorkout(userId, workoutId, workout);
		return new ResponseEntity<Workout>(updatedWorkout,HttpStatus.OK);
	}
	
}
