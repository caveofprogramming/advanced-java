package app.gui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import app.model.Book;

public class ViewBooksPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private BookTableModel tableModel;
	private JTable table;

	public ViewBooksPanel(List<Book> bookList) {
		
		tableModel = new BookTableModel(bookList);
		table = new JTable(tableModel);
		
		setLayout(new BorderLayout());
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		
	}
}
