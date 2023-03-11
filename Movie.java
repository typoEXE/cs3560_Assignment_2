/**
 * Name: Tyler Hipolito
 * Course: cs3560
 * Problem #5 Part G
 */

package cs3560_Assignment_2;

import java.util.List;

public class Movie {
	private String name;
	private String genre;
	private List<Watch> listWatch;

	public Movie(String name, String genre, List<Watch> listWatch) {
		this.name = name;
		this.genre = genre;
		this.listWatch = listWatch;
	}

}
