
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class dizzyTortoise {

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		String spins = JOptionPane.showInputDialog("How many spins can this tortoise do?");
		int turtleSpins = Integer.parseInt(spins);
		// 1. Use the dance method to make the Tortoise spin.
		dance(turtleSpins);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
