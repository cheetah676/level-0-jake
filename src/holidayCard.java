import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class holidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree grows with each layer

	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green
		Tortoise.setSpeed(10);
		Tortoise.setY(50);
		Tortoise.setPenColor(Color.GREEN);
		// 1. Make a variable for turnAmount and set it to 175
		int turtleTurn = 175;
		// 2. Start the Tortoise facing to the right
		Tortoise.setAngle(90);
		// 5. Repeat steps 3 through 11, 11 times
		for (int i = 0; i <= 11; i++) {

			// 3. Move the tortoise the width of the tree
			Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
			Tortoise.turn(turtleTurn);
			// 6. Set the treeWidth to the current treeWidth times the scale
			treeWidth *= scale;
			// 7. Move the tortoise the width of a tree again
			Tortoise.move(treeWidth);
			// 9. Turn the tortoise the current turn amount to the LEFT
			Tortoise.turn(-turtleTurn);
			// 10. Set the treeWidth to the current treeWidth times the scale again
			treeWidth *= scale;
			// 11. Decrease turnAmount by 1
			turtleTurn--;
		}
	}

	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(treeWidth / 2);
		// 2. Change the tortoise so that it is pointing straight down
		Tortoise.setAngle(180);
		// 4. Set the pen width to the tree width divided by 10
		Tortoise.setPenWidth(treeWidth / 10);
		// 5. Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(PenColors.Browns.SaddleBrown);
		// 3. Move the tortoise a quarter the tree width
		Tortoise.move(treeWidth / 4);
		Tortoise.move(-treeWidth / 4);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.setPenWidth(1);
		Tortoise.move(treeWidth / 2);
	}

	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse clicked!");
		drawTree();
		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
		Tortoise.setX(mouseX);
		drawTree();
	}

	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.

	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it

		// Use the writeGreeting() method to add a festive message
		writeGreeting("MERRY CHRISTMAS");
	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String nameOfSoundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(nameOfSoundFile));
		sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth / 5);
	}

	public static void main(String[] args) {
		new holidayCard();
	}

	TurtlePanel tortoiseWindow;

	holidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}
