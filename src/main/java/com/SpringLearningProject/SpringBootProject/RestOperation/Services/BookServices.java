package com.SpringLearningProject.SpringBootProject.RestOperation.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.SpringLearningProject.SpringBootProject.RestOperation.Entity.Book;

public interface BookServices {
	public Book CreateBook(Book book);
	public List<Book> ReadBooks();
	public Book BookById(int id);
	public void deleteBook(int id);
	public void updateBook(Book book, int bookid);	
}
