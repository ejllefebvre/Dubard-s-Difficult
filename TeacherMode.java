import javax.swing.*;
import java.util.*;
import java.awt.Dimension;
import java.awt.event.*;

//*************************
//THIS USES THREE CLASSES: 
//TeacherMode
//StudentPanel
//and Student
//@joseph I made a few changes to the Student class so make sure you use the edits 
//*************************

public class TeacherMode implements ActionListener {

	private JFrame frame;
	private JPanel bigPanel;
	private JScrollPane scroll;
	private JButton enter = new JButton("ENTER CHOICES");
	private String[] names = {" ", "Amy", "Bob", "Carla", "Dave", "Erinn", "Frank", "Greg", "Hannah"}; 
	public ArrayList<String> studentNames = new ArrayList<String>(Arrays.asList(names));
	//names will not exist in final version, it is just there so that I could input the names for testing easily
	//studentNames will have to not be a static variable in the real thing when it is attached to the other part
	public int numStudes;
	public ArrayList<StudentPanel> panelList;
	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<String[]> resultArray;
	
	public static void main(String[] args){
		TeacherMode t = new TeacherMode();
	}
	
	public TeacherMode() {
		//studentNames.add("RESET LIST");
		numStudes = studentNames.size()-1;
		resultArray = new ArrayList<String[]>();
		enter.addActionListener(this);
		initialize();
		createStudentObjects();
		createPanels();
		
	}

	private void initialize() {
		frame = new JFrame("TEACHER MODE");
		frame.setBounds(0, 0, 825, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		bigPanel = new JPanel();
		bigPanel.setLayout(null);
		bigPanel.setPreferredSize(new Dimension(1000, 1000));
		scroll = new JScrollPane(bigPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(0, 0, 800, 900);
		scroll.setVisible(true);
		frame.add(scroll);
		
		JLabel firstChoicelbl = new JLabel("FIRST CHOICE");
		JLabel secondChoicelbl = new JLabel("SECOND CHOICE");
		JLabel thirdChoicelbl = new JLabel("THIRD CHOICE");
		firstChoicelbl.setBounds(230, 26, 100, 40);
		secondChoicelbl.setBounds(415, 26, 100, 40);
		thirdChoicelbl.setBounds(600, 26, 100, 40);
		bigPanel.add(firstChoicelbl);
		bigPanel.add(secondChoicelbl);
		bigPanel.add(thirdChoicelbl);
		

	}
	
	private void createStudentObjects(){
		for(int x = 0; x < numStudes; x++){
			students.add(new Student(studentNames, x+1));
		}
		for(int x = 0; x <numStudes; x++){
			//students.get(x).setChoice1List();
			//students.get(x).setChoice2List();
			//students.get(x).setChoice3List();
		}
	}
	
	private void createPanels(){
		panelList = new ArrayList<StudentPanel>();
		for(int x = 0; x < numStudes; x++){
			panelList.add(new StudentPanel(students.get(x)));
		}
		for(int x = 0; x < numStudes; x++){
			bigPanel.add(panelList.get(x).panel);
			}
		enter.setBounds(354, StudentPanel.y +20, 189, 43);
		bigPanel.add(enter);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(enter)){
			for(int x = 0; x < numStudes; x++){
				String[] temp = new String[4];
				temp[0] = panelList.get(x).student.name;
				temp[1] = (String) panelList.get(x).firstChoiceList.getSelectedItem();
				temp[2] = (String) panelList.get(x).secondChoiceList.getSelectedItem();
				temp[3] = (String) panelList.get(x).thirdChoiceList.getSelectedItem();
				resultArray.add(temp);

			}
			
		}
		
	}


	
}
