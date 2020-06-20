package app.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewBooksPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private BookTableModel tableModel;
	private JTable table;

	public ViewBooksPanel() {
		
		tableModel = new BookTableModel();
		table = new JTable(tableModel);
		
		setLayout(new BorderLayout());
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		
	}
}
