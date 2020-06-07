package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
		
		var nameField = new JTextField(15);
		var passField = new JTextField(15);
		
		var addButton = new JButton("Save");
		
		setLayout(new GridBagLayout());
		
		var gc = new GridBagConstraints();
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		gc.weightx = 1; 
		
		gc.gridwidth = 2;
		add(formLabel, gc);
		
		gc.gridy++;
		gc.gridwidth = 1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);
		
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(passLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(passField, gc);
		
		gc.gridy++;
		gc.gridx = 1;
		
		add(addButton, gc);
		
	}

}
