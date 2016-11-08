


import org.jointheleague.graphical.robot.Robot;
public class TriangleShells {
	
		// 1. Create a new Robot
	Robot jakey=new Robot();

		
		

		void go(){
			// 6. Make the robot go as fast as possible
			jakey.setSpeed(11);

			// 4. make a variable to hold the length of the triangle and set it to 50
	int length=50;
	
			// 7. Do the following (up to step 10) 60 times
	for (int j = 0; j < 60000000; j++) {
		
	

				// 9. Change the color of the pen to a random color
		jakey.setRandomPenColor();
				// 8. Increase the length of the side by 10 pixels
		length+=10;
				// 5. call your drawTriangle() method using your length variable
		drawTriangle(length);
				// 10. Turn the tortoise 6 degrees to the right
		jakey.turn(-6);
	}
		}
		


		/* 2. fill in the method below to draw a triangle. 
		 * Use the length variable for the size of the triangle. */
		private void drawTriangle(int length) {
			
			jakey.penDown();
		jakey.move(length);
		jakey.turn(105);
		jakey.move(length);	
		jakey.turn(120);	
		jakey.move(length);
		jakey.turn(125);
		}


		
		public static void main(String[] args) {
			new TriangleShells().go();
		}
	}








