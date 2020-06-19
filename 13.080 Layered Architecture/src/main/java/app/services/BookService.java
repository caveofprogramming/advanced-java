package app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entities.Book;
import app.repositories.BookDao;

@Service
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	
	public List<Book> getAll() {
		
		List<Book> books = new ArrayList<>();
		bookDao.findAll().forEach(book -> books.add(book));
		
		return books;
	}
	
	public void save(Book book) {
		bookDao.save(book);
	}
	
	public Book getBook(Long id) {
		var bookOpt = bookDao.findById(id);
		
		if(bookOpt.isPresent()) {
			return bookOpt.get();
		}
		
		return null;
	}
}
