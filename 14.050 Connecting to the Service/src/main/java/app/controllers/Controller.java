package app.controllers;

import java.io.IOException;

import app.gui.CreateBookPanel;
import app.gui.MainFrame;
import app.gui.ViewBooksPanel;
import services.BookService;

public class Controller {
	
	private MainFrame mainFrame;
	private CreateBookPanel createPanel;
	private ViewBooksPanel viewPanel;
	private BookService bookService;
	
	public Controller() {
		
		bookService = new BookService();
		
		try {
			bookService.getAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		createPanel = new CreateBookPanel();
		
		
		createPanel.setFormListener((author, title) -> {
			System.out.println(author + ": " + title);
		});
		
		viewPanel = new ViewBooksPanel();
		
		
		mainFrame = new MainFrame(createPanel, viewPanel);
	}

}
