/**
 * Name: Tyler Hipolito
 * Course: cs3560
 * Problem #5 Part E
 */

package cs3560_Assignment_2;

public class Professor extends Employee{
	private String field;
	
	public Professor() {
		super();
	}
	
	public Professor(String name, int hours, String field) {
		super(name, hours);
		this.field = field;
	}
	@Override
	public double calculateSalary() {
		return super.getHours()*30;
	}

}
