package main;

import java.util.ArrayList;



import main.school.Classroom;
import main.school.Student;
import main.school.Teacher;
import main.util.Displayable;
import main.util.KeyboardReader;

public class PrintReports {
	static ArrayList<Displayable> classroomList = new ArrayList<Displayable>();
	
	public static void main(String[] args) {
		char choiceClassroom;
		char choiceStudent;
		
		do {
			System.out.println("First You Need To Create A Classroom.");
			int roomNumber = KeyboardReader.getPromptedInt("Enter Room Number: ");
				do {
					if (roomNumber < 100) System.out.println("Room Number must be higher than 100.");
					roomNumber = KeyboardReader.getPromptedInt("Enter Room Number: ");
				} while (roomNumber < 100);
					
			
			Displayable classroom = new Classroom(roomNumber);
			classroomList.add(classroom);
			
			System.out.println("Now You Need to Enter A Teacher For The Classroom: ");
			String firstName = KeyboardReader.getPromptedString("Enter Teacher First Name: ");
			String lastName = KeyboardReader.getPromptedString("Enter Teacher Last Name: ");
			String subject = KeyboardReader.getPromptedString("Enter Subject Taught: ");
			Displayable teacher = new Teacher(firstName, lastName, subject);
			classroomList.add(teacher);
			
			do {
				System.out.println("Now You Need To Add Students For The Classroom.");
				String sFirstName = KeyboardReader.getPromptedString("Enter Student First Name: ");
				String sLastName = KeyboardReader.getPromptedString("Enter Student Last Name: ");
				
				int studentId = KeyboardReader.getPromptedInt("Enter Student ID: ");
					do {
						if (studentId <= 0.0) System.out.println("Student ID must be higher than 0.");
						studentId = KeyboardReader.getPromptedInt("Enter Student ID: ");
					} while (studentId <= 0.0);
					
				int finalGrade = KeyboardReader.getPromptedInt("Enter Student Final Grade: ");
					do {
						if (finalGrade <= 0.0) System.out.println("Student Final Grade must be higher than 0.");
						finalGrade = KeyboardReader.getPromptedInt("Enter Student Final Grade: ");
					} while (finalGrade <= 0.0);
				
				Displayable student = new Student(sFirstName, sLastName, studentId, finalGrade);
				classroomList.add(student);
				
				choiceStudent = KeyboardReader.getPromptedChar("Enter information for new Student? Y or N ");
			
			} while ((choiceStudent == 'y') || (choiceStudent == 'Y'));	
			
			choiceClassroom = KeyboardReader.getPromptedChar("Enter information for new classroom? Y or N ");
			
		} while ((choiceClassroom == 'y') || (choiceClassroom == 'Y'));
		
		
		
		
		System.out.println("-----------------------------------");
		for (Displayable output : classroomList) {
			System.out.println(output.display());	
		}
		System.out.println("-----------------------------------");
		
		
		
		

	}
}

