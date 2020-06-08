package controller;

import gui.MainFrame;
import gui.MainPanel;

public class Controller {
	private MainFrame mainFrame;
	private MainPanel mainPanel;
	
	public Controller() {
		
		mainPanel = new MainPanel();
		
		mainPanel.setFormListener((username, password) -> {
			System.out.println(username + ": " + password);
		});
		
		mainFrame = new MainFrame();
		
		mainFrame.setContentPane(mainPanel);
	}
}
