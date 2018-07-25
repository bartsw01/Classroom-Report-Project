package main.school;

import java.util.ArrayList;

import main.util.Displayable;

public class Classroom implements Displayable {

	private int roomNumber;
	private Displayable teacher;
	private ArrayList<Displayable> students;
	
	public Classroom() {
		
	}
	
	public Classroom(int roomNumber) {
		setRoomNumber(roomNumber);
		
	}
	
	public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
		setRoomNumber(roomNumber);
		setTeacher(teacher);
		setStudents(students);
		
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Displayable getTeacher() {
		return teacher;
	}

	public void setTeacher(Displayable teacher) {
		this.teacher = teacher;
	}
	
	public ArrayList<Displayable> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Displayable> students) {
		this.students = students;
	}
	
	
	@Override
	public String display() {
		return "Classroom Number: " + getRoomNumber();
	}

	

	

}
