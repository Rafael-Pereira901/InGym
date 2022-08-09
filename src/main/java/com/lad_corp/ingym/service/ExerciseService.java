package com.lad_corp.ingym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lad_corp.ingym.entity.Exercise;
import com.lad_corp.ingym.repository.ExerciseRepository;

@Service
public class ExerciseService {
	
	private ExerciseRepository exerciseRepository;
	
	@Autowired 
	public ExerciseService(ExerciseRepository exerciseRepository) {
		this.exerciseRepository = exerciseRepository;
	}
	
	public Exercise createExercise(Exercise exercise) {
		exerciseRepository.save(exercise);
		return exercise;
	}

}
