/**
 * Name: Tyler Hipolito
 * Course: cs3560
 * Problem #1 Part B
 */

package cs3560_Assignment_2;

public class studentTest {

	public static void main(String[] args) {
		
		// First student
		Student studentOne = new Student("john", "CS", 3.5);
		
		// Second student
		Student studentTwo = new Student();
		studentTwo.setName("Mary Ann");
		studentTwo.setMajor("CE");
		studentTwo.setGpa(3.3);
		
		// Return both students
		System.out.println(studentOne.toString());
		System.out.println(studentTwo.toString());
	}
}