import java.util.ArrayList;

public class Student {
		String name;
		
		ArrayList<String> choice1List;
		String choice1;
		
		ArrayList<String> choice2List;
		String choice2;
		
		ArrayList<String> choice3List;
		String choice3;
		
		ArrayList<String> namesList;
		
		public Student(ArrayList<String> names, int index) {
			namesList = names;
			choice1List = namesList;
			choice2List = namesList;
			choice3List = namesList;
			
			choice1List.remove(name);
			choice2List.remove(name);
			choice3List.remove(name);
			
			choice1 = "none";
			choice2 = "none";
			choice3 = "none";
			
			name = namesList.get(index);
		}
		
		public void setChoice1List() {
			choice1List.remove(name);
			if(!choice2.equals("none")) {
				choice1List.remove(choice2);
			} if(!choice3.equals("none")) {
				choice1List.remove(choice3);
			}
		}
		
		public void setChoice2List() {
			choice2List.remove(name);
			if(!choice1.equals("none")) {
				choice2List.remove(choice1);
			} if(!choice3.equals("none")) {
				choice2List.remove(choice3);
			}
		}
		
		public void setChoice3List() {
			choice3List.remove(name);
			if(!choice1.equals("none")) {
				choice3List.remove(choice1);
			} if(!choice2.equals("none")) {
				choice3List.remove(choice2);
			}
		}
		
		public void setChoice1(String name) {
			choice1 = name;
		}
		
		public void setChoice2(String name) {
			choice2 = name;
		}
		
		public void setChoice3(String name) {
			choice3 = name;
		}
	}