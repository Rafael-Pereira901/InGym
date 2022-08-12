package com.lad_corp.ingym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lad_corp.ingym.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{}
