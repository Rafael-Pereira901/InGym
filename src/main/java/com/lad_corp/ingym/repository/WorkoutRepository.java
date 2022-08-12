package com.lad_corp.ingym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lad_corp.ingym.entity.Workout;

public interface WorkoutRepository extends JpaRepository<Workout,Long > {}
