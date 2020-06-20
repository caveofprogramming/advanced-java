package app;

import javax.swing.SwingUtilities;

import app.controllers.Controller;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Controller::new);
	}

}
