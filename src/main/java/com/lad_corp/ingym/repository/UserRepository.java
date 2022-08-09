package com.lad_corp.ingym.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lad_corp.ingym.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{}
