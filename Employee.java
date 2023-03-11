/**
 * Name: Tyler Hipolito
 * Course: cs3560
 * Problem #5 Part E
 */

package cs3560_Assignment_2;

public abstract class Employee {
	private String name;
	private int hours;
	
	public Employee() {
		
	}
	
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	public double getHours() {
		return hours;
		
	}
	public double calculateSalary() {
		return hours*20;
	}
	
}
	
