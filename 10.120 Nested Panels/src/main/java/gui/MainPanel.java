package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	
	public MainPanel() {
		var formLabel = new JLabel("Add User");
		formLabel.setFont(new Font("Serif", Font.PLAIN, 30));
		
		var nameLabel = new JLabel("Name:");
		var passLabel = new JLabel("Password:");
		
		var nameField = new JTextField(15);
		var passField = new JTextField(15);
		
		var addButton = new JButton("Save");
		
		setLayout(new GridBagLayout());
		
		var gc = new GridBagConstraints();
		
		var rightPad = new Insets(0, 0, 0, 10);
		var zeroInsets = new Insets(0, 0, 0, 0);
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		gc.weightx = 1; 
		gc.weighty = 20;
		
		gc.gridwidth = 2;
		add(formLabel, gc);
		
		gc.gridy++;
		gc.gridwidth = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = rightPad;
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = zeroInsets;
		add(nameField, gc);
		
		gc.gridy++;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = rightPad;
		add(passLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = zeroInsets;
		add(passField, gc);
		
		gc.gridy++;
		gc.weighty = 30;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		add(addButton, gc);
		
	}

}
