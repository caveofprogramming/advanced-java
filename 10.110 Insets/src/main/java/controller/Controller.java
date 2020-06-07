package controller;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
