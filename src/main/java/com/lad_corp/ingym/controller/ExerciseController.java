package com.lad_corp.ingym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lad_corp.ingym.entity.Exercise;
import com.lad_corp.ingym.service.ExerciseService;



@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

	private ExerciseService exerciseService;

	@Autowired
	public ExerciseController(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}
	
	@PostMapping 
	public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise){
		 return new ResponseEntity<Exercise>(exerciseService.createExercise(exercise), HttpStatus.CREATED);
	}
	
}
