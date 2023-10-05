package com.SpringLearningProject.SpringBootProject.RestOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearningProject.SpringBootProject.RestOperation.Entity.Book;
import com.SpringLearningProject.SpringBootProject.RestOperation.Services.BookServices;

@RestController
public class BookController {

	@Autowired
	public BookServices bookServices;
	@PostMapping(value = "/createbooks")
	public Book CreateBooks() {
		Book book=new Book();
		book.setTitle("Animal Farm");
		book.setAuthor("George Orwell");
		
		return bookServices.CreateBook(book);
		
	}
	@GetMapping(value = "/books")
	public List<Book> getBooks() {
		return bookServices.ReadBooks();
		
	}
	
	@GetMapping(value = "/books/{id}")
	public Book getBooksById(@PathVariable("id") int id) {
		return bookServices.BookById(id);
		
	}
}
