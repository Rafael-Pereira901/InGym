package com.lad_corp.ingym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lad_corp.ingym.entity.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {}
