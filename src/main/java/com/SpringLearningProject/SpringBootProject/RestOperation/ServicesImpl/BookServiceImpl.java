package com.SpringLearningProject.SpringBootProject.RestOperation.ServicesImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLearningProject.SpringBootProject.RestOperation.Dao.BookDao;
import com.SpringLearningProject.SpringBootProject.RestOperation.Entity.Book;
import com.SpringLearningProject.SpringBootProject.RestOperation.Services.BookServices;

@Service
public class BookServiceImpl implements BookServices {

	@Autowired
	public BookDao bookdao; 
	@Override
	public Book CreateBook(Book book) {
		// TODO Auto-generated method stub
		return bookdao.save(book);
	}
	@Override
	public List<Book> ReadBooks() {
		// TODO Auto-generated method stub
		return (List<Book>) bookdao.findAll();
	}
	@Override
	public Book BookById(int id) {
		
		return ReadBooks().stream().filter(e->e.getId()==id).findFirst().get();
	}
	@Override
	public void deleteBook(int id) {
	bookdao.deleteById(id);
	}
	@Override
	public void updateBook(Book book, int bookid) {
		
		Optional<Book> obj = bookdao.findById(bookid);
		if(obj.isPresent()) {
		Book book1 = obj.get();
		book1.setTitle(book.getTitle());
		book1.setAuthor(book.getAuthor());
		bookdao.save(book1);
		}
	}
	
}
