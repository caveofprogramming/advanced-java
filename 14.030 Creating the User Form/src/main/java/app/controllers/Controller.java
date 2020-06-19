package app.controllers;

import app.gui.CreateBookPanel;
import app.gui.MainFrame;
import app.gui.ViewBooksPanel;

public class Controller {
	
	private MainFrame mainFrame;
	private CreateBookPanel createPanel;
	private ViewBooksPanel viewPanel;
	
	public Controller() {
		
		createPanel = new CreateBookPanel();
		
		
		createPanel.setFormListener((author, title) -> {
			System.out.println(author + ": " + title);
		});
		
		viewPanel = new ViewBooksPanel();
		
		
		mainFrame = new MainFrame(createPanel, viewPanel);
	}

}
