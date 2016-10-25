
 
	import org.jointheleague.graphical.robot.Robot;
	import java.awt.Color;




	/*** Teacher's note ***/
	 /* Before beginning recipe: 
	 * 1. ask students to find and explain the variables in this recipe. 
	 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */


	public class FlamingNinjaStar {
		public static void main(String[] args) {

			int i =100;
			int baseSize = 300;		//the size of the black part of the star
			int flameSize = 200;		//the length of the flaming arms


			// 1. Make a new robot, and set it's pen down.
			Robot Jakey = new Robot();
			Jakey.penDown();
			// *14. Use the methods setX and setY to move the ninja star into the center of the screen
			Jakey.setX(1000);
			Jakey.setY(350);
			// *15. Make some adjustments to see what other kinds of shapes you can make.


			// 12. Set the robot speed to 10
			Jakey.setSpeed(i);

			// 13. Make all the code below repeat 25 times
			for (int j = 0; j < 5000000; j++) {
				
			
			
				// 2. Turn the robot 1/8 of a circle
			Jakey.turn(360/8);;
				// 3. Move the robot 64 pixels
			Jakey.move(64);

				
				// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
				Jakey.turn(-400);
				// 5. Move the robot the distance in the variable flameSize
				Jakey.setPenColor(Color.orange);
				Jakey.move(flameSize);
				// 6. Turn the robot 170 degrees
				Jakey.turn(200);
				// 7. Move the robot the distance in the variable flameSize (again)
				Jakey.move(flameSize);
				Jakey.setPenColor(Color.black);
				// 8. Turn the robot 64 degrees to the right
				Jakey.turn(100);
				// 9. Move the robot the distance in the variable baseSize
				Jakey.move(baseSize);
				// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
				// 11. Color your ninja star like Figure 2.
			}
			
		}


	}