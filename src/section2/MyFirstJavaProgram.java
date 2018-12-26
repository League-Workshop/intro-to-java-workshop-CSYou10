package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE	
		Robot CSY = new Robot();
		CSY.setSpeed(200);
		CSY.setPenColor(Color.cyan);
		CSY.penDown();
		for (int i = 0; i < 4; i++) {
			CSY.move(100);
			CSY.turn(90);}	
		CSY.penUp();
		CSY.move(100);
		CSY.move(100);
		CSY.penDown();
		for (int i = 0; i < 4; i++) {
			CSY.move(100);
			CSY.turn(90);	
		}
		
	}
}
		
		
	
	
		
	

		
