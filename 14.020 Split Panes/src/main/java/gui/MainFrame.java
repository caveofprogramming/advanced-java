package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JSplitPane splitPane;

	public MainFrame(JPanel upperPanel, JPanel lowerPanel) {
		
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, upperPanel, lowerPanel);
		splitPane.setResizeWeight(0.3);
		
		setLayout(new BorderLayout());
		
		add(splitPane, BorderLayout.CENTER);
		
		setSize(1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
