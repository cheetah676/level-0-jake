
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class spiralMaker {

	public static void main(String[] args) {

		// 3. Make a variable to hold the number of sides and set it to 0
		int ShapeSides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String answer = JOptionPane.showInputDialog("Do you want a square, triangle, or pentagon spiral?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (answer.equals("pentagon")) {
			ShapeSides = 360 / 5;
		} else if (answer.equals("triangle")) {
			ShapeSides = 360 / 3;
		} else if (answer.equals("square")) {
			ShapeSides = 360 / 4;
		} else {
			JOptionPane.showConfirmDialog(null, "Sorry, I don't know how to draw a " + answer);
		}
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."

		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions:
		// http://bit.ly/YJUOkn

		// 2. Change your code to turn the square spiral into a triangle spiral
		for (int i = 1; i <= 80; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(i * 4);
			Tortoise.turn(ShapeSides);
		}
	}

}
