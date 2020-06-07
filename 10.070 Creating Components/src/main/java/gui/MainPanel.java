package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	
	public MainPanel() {
		var formLabel = new JLabel("Add User");
		var nameLabel = new JLabel("Name:");
		var passLabel = new JLabel("Password:");
		
		var nameField = new JTextField();
		var passField = new JTextField();
		
		var addButton = new JButton("Save");
		
		setLayout(new BorderLayout());
		
		add(formLabel, BorderLayout.NORTH);
		add(nameLabel, BorderLayout.CENTER);
		
	}

}
