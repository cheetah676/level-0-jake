import org.jointheleague.graphical.robot.Robot;
public class tortoiseCube {
public static void main(String[]args){
	for (int i = 0; i < -1; i++) {
		
	}
	
}
static void drawCube3D(){
	Robot bob=new Robot();
	bob.setSpeed(10);
	bob.move(200);
	bob.turn(180);
	bob.penDown();
	bob.move(400);
	bob.turn(90);
	bob.move(400);
	bob.turn(90);
	bob.move(400);
	bob.turn(90);
	bob.move(400);
	bob.turn(-50);
	bob.move(300);
	bob.turn(-130);
	bob.move(450);
	bob.turn(-58);
	bob.move(270);
	bob.turn(180);
	bob.move(270);
	bob.turn(150);
	bob.move(450);
	bob.turn(33);
	bob.move(220);
	bob.turn(180);
	bob.move(220);
	bob.turn(55);
	bob.move(463);
	bob.turn(-90);
	bob.move(448);
	bob.turn(180);
	bob.move(450);
	bob.turn(47);
	bob.move(258);
	bob.hide();
}
}
