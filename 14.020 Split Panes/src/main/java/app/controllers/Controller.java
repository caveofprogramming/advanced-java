package app.controllers;

import gui.CreateBookPanel;
import gui.MainFrame;
import gui.ViewBooksPanel;

public class Controller {
	
	private MainFrame mainFrame;
	private CreateBookPanel createPanel;
	private ViewBooksPanel viewPanel;
	
	public Controller() {
		
		createPanel = new CreateBookPanel();
		viewPanel = new ViewBooksPanel();
		
		
		mainFrame = new MainFrame(createPanel, viewPanel);
	}

}
