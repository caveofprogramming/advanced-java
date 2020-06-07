package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	
	public MainPanel() {
		var formLabel = new JLabel("Add User");
		formLabel.setFont(new Font("Serif", Font.PLAIN, 30));
		
		setLayout(new GridBagLayout());
		
		var gc = new GridBagConstraints();
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		gc.weighty = 1; 
		
		add(formLabel, gc);	
		
		gc.weighty = 1.5; 
		gc.gridy++;
		gc.anchor = GridBagConstraints.NORTH;
	
		add(createFormPanel(), gc);
	}
	
	private JPanel createFormPanel() {
		JPanel panel = new JPanel();
		
		var padding = 20;
		var etchedBorder = BorderFactory.createEtchedBorder();
		var emptyBorder = BorderFactory.createEmptyBorder(padding, padding, padding, padding);
		
		panel.setBorder(BorderFactory.createCompoundBorder(etchedBorder, emptyBorder));
		
		var nameLabel = new JLabel("Name:");
		var passLabel = new JLabel("Password:");
		
		var nameField = new JTextField(15);
		var passField = new JTextField(15);
		
		var addButton = new JButton("Save");
		
		var gc = new GridBagConstraints();
		
		panel.setLayout(new GridBagLayout());
		
		var rightPad = new Insets(0, 0, 0, 10);
		var zeroInsets = new Insets(0, 0, 0, 0);
		
		gc.gridy++;
		gc.gridwidth = 1;
		gc.weighty = 0.1;
	
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = rightPad;
		panel.add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = zeroInsets;
		panel.add(nameField, gc);
		
		gc.gridy++;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = rightPad;
		panel.add(passLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = zeroInsets;
		panel.add(passField, gc);
		
		gc.gridy++;
		gc.weighty = 30;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		
		panel.add(addButton, gc);
		
		return panel;
	}

}
