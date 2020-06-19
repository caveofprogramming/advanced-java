package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.entities.Book;
import app.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public Book books() {

		var book = new Book("Charles Dickens", "Great Expectations");

		return book;
	}
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		
		System.out.println("Creating: " + book);
		book.setId(7L);
		return book;
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		var book = new Book("Charles Dickens", "Great Expectations");
		
		System.out.println("Book ID: " + id);
		
		book.setId(id);

		return book;
	}

}
