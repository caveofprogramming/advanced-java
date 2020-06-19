package app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import app.entities.Book;
import app.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> books() {
		return bookService.getAll();
	}
	
	@PostMapping("/books")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createBook(@RequestBody Book book) {
		bookService.save(book);
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		return bookService.getBook(id);
	}

}
