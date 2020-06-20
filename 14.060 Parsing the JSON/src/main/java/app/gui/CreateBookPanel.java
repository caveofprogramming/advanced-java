package app.gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateBookPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private UserFormListener formListener;

	public CreateBookPanel() {
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		add(createFormPanel(), gc);
	}
	
	public void setFormListener(UserFormListener formListener) {
		this.formListener = formListener;
	}
	

	private JPanel createFormPanel() {
		JPanel panel = new JPanel();
		
		var padding = 20;
		var etchedBorder = BorderFactory.createEtchedBorder();
		var emptyBorder = BorderFactory.createEmptyBorder(padding, padding, padding, padding);
		
		panel.setBorder(BorderFactory.createCompoundBorder(etchedBorder, emptyBorder));
		
		var authorLabel = new JLabel("Author:");
		var titleLabel = new JLabel("Title:");
		
		var authorField = new JTextField(15);
		var titleField = new JTextField(15);
		
		var addButton = new JButton("Save");
		
		addButton.addActionListener(e -> {
			String author = authorField.getText();
			String title = titleField.getText();
			
			if(formListener != null) {
				formListener.formSubmitted(author, title);
			}
		});
		
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
		panel.add(authorLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = zeroInsets;
		panel.add(authorField, gc);
		
		gc.gridy++;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = rightPad;
		panel.add(titleLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = zeroInsets;
		panel.add(titleField, gc);
		
		gc.gridy++;
		gc.weighty = 30;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		
		panel.add(addButton, gc);
		
		return panel;
	}
}
