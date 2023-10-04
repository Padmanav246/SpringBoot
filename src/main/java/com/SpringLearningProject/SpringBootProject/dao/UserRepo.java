package com.SpringLearningProject.SpringBootProject.dao;

import org.springframework.data.repository.CrudRepository;

import com.SpringLearningProject.SpringBootProject.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

//	custom finder methods
	
}
