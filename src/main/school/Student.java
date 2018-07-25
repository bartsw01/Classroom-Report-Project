package main.school;

import main.school.Person;
import main.util.Displayable;

public class Student extends Person implements Displayable {
	private int studentId;
	private int finalGrade;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, int studentId, int finalGrade) {
		setFirstName(firstName);
		setLastName(lastName);
		setStudentId(studentId);
		setFinalGrade(finalGrade);
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}

	@Override
	public String display() {
		return "Student ID: " + studentId + "  " + getFullName() + "  Final Grade: " + finalGrade; 
	}
	
}
