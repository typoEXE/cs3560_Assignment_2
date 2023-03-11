/**
 * Name: Tyler Hipolito
 * Course: cs3560
 * Problem #1 Part A
 */

package cs3560_Assignment_2;

public class Student {
	
	private String name;
	private String major;
	private double gpa;	
	
	public Student() {
		// No args constructor for Student
	}
	
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
	}

	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
		return String.format("Name: "+name+ ", Major: " +major+ ", GPA: "+gpa+"");
	}
	
	public boolean equals(Student student) {
		return true;
	}

}
