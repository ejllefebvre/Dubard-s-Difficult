
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.SystemColor;


public class TableChecker extends JFrame{

	
	JTable TableChecker;
	
	public TableChecker() {
		
		setLayout(new FlowLayout());	
		
		String[] header = {"Student Name", "Choice 1", "Choice 2", "Choice 3"};
		Object [][] data = {
				{"Test1","Test2","Test3","Test4"},
				{"Test2","Test3","Test4","Test1"},
				{"Test3","Test4","Test1","Test2"},
				{"Test4","Test1","Test2","Test3"}
		};
		
		TableChecker = new JTable(data, header);
		TableChecker.setPreferredScrollableViewportSize(new Dimension (500,400));
		TableChecker.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(TableChecker);
		add(scrollPane);
		
		
		
	}
	public static void main(String[] args) {
		TableChecker gui = new TableChecker();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(744,418);
		gui.setVisible(true);
		gui.setTitle("Please check your students' choices.");
	
	}
}

