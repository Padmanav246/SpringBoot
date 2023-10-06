package com.SpringLearningProject.SpringBootProject.RestOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearningProject.SpringBootProject.RestOperation.Entity.Book;
import com.SpringLearningProject.SpringBootProject.RestOperation.Services.BookServices;

@RestController
public class BookController {

	@Autowired
	public BookServices bookServices;
	@GetMapping(value = "/createbooks")
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
	@PostMapping(value = "/addbooks")
	public Book addBook(@RequestBody Book book) {
		Book b=this.bookServices.CreateBook(book);
		return b;
		
	}
	@DeleteMapping(value = "/deletebooks/{bookid}")
	public void deleteBooks(@PathVariable("bookid") int bookid) {
		bookServices.deleteBook(bookid);		
	}
	
}
