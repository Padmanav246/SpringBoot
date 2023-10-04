package com.SpringLearningProject.SpringBootProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.SpringLearningProject.SpringBootProject.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

//	custom finder methods
	
	/*	To create custom methos using diffrent keywords check bellow link
	Reference Documentation -> Query Methods -> Query Creation
	https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference */
	public List<User> findByName(String name);
	
	
	
//own JPQL querry or native querry using @Query
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.id=:n AND u.city=:c")
	public List<User> getUserByIdAndCity(@Param("n")int id,@Param("c")String city);
	
}
