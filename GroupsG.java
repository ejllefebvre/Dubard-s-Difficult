
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.SystemColor;


public class GroupsG {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupsG window = new GroupsG();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	
	/**
	 * Create the application.
	 */
	public GroupsG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("ComboBox.disabledForeground"));
		frame.setBounds(300, 175, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 60, 744, 418);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(268, 20, 61, 27);
		panel.add(btnNewButton);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblStudent.setBounds(338, 23, 72, 20);
		panel.add(lblStudent);
		
		JButton button = new JButton(">\n");
		button.setBounds(401, 20, 61, 27);
		panel.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(295, 88, 164, 27);
		panel.add(comboBox);
		comboBox.addItem("Test");
		comboBox.addItem("Test 2");
		comboBox.addItem("Test 3");
		comboBox.addItem("Test 4");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(295, 134, 164, 27);
		panel.add(comboBox_1);
		comboBox_1.addItem("Test");
		comboBox_1.addItem("Test 2");
		comboBox_1.addItem("Test 3");
		comboBox_1.addItem("Test 4");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(295, 182, 164, 27);
		panel.add(comboBox_2);
		comboBox_2.addItem("Test");
		comboBox_2.addItem("Test 2");
		comboBox_2.addItem("Test 3");
		comboBox_2.addItem("Test 4");
		
		JLabel lblChoice = new JLabel("Choice #1");
		lblChoice.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblChoice.setBounds(190, 92, 93, 16);
		panel.add(lblChoice);
		
		JLabel lblChoice_1 = new JLabel("Choice #2");
		lblChoice_1.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblChoice_1.setBounds(190, 138, 93, 16);
		panel.add(lblChoice_1);
		
		JLabel lblChoice_2 = new JLabel("Choice #3");
		lblChoice_2.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblChoice_2.setBounds(190, 186, 93, 16);
		panel.add(lblChoice_2);
		
		JButton btnDpne = new JButton("Done");
		btnDpne.setBounds(621, 383, 117, 29);
		panel.add(btnDpne);
		
		JLabel lblStudentFprm = new JLabel("Student Form");
		lblStudentFprm.setFont(new Font("Monaco", Font.PLAIN, 13));
		lblStudentFprm.setBounds(325, 19, 125, 16);
		frame.getContentPane().add(lblStudentFprm);
	}	
}

