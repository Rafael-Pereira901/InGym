package com.lad_corp.ingym.entity;

import java.util.HashSet;
import java.util.Set;

public class Workout {

	private String name;
	private Set<Integer> exercises = new HashSet<>();
	
	public Workout() {}

	public Workout(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Integer> getExercises() {
		return exercises;
	}
	
}
