package controller;

import gui.MainFrame;
import gui.MainPanel;

public class Controller {
	private MainFrame mainFrame;
	private MainPanel mainPanel;
	
	public Controller() {
		
		mainPanel = new MainPanel();
		mainFrame = new MainFrame();
		
		mainFrame.setContentPane(mainPanel);
	}
}
