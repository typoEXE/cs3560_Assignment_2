/**
 * Name: Tyler Hipolito
 * Course: cs3560
 * Problem #5 Part E
 */

package cs3560_Assignment_2;

public class Staff extends Employee{
	private int role;
	
	public Staff() {
		super();
	}
	
	public Staff(String name, int hours, int role) {
		super(name, hours);
		this.role = role;
	}

}
