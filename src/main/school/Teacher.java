package main.school;

import main.school.Person;
import main.util.Displayable;

public class Teacher extends Person implements Displayable {
	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String firstName, String lastName, String subject) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSubject(subject);
		
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	
	@Override
	public String display() {
		return getFullName() + " teaches " + getSubject();
	}
	

}
