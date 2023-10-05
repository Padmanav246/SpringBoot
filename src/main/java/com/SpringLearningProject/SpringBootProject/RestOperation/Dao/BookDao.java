package com.SpringLearningProject.SpringBootProject.RestOperation.Dao;

import org.springframework.data.repository.CrudRepository;

import com.SpringLearningProject.SpringBootProject.RestOperation.Entity.Book;

public interface BookDao extends CrudRepository<Book, Integer> {

}
