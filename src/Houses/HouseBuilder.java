package Houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseBuilder {
  Robot Bob = new Robot();
  
  
  void moveToBottomLeftCorner() {
	  Bob.moveTo(50, 925);
  }
   void drawHouse(int a) {
	   
	   Bob.penDown();
	   Bob.setSpeed(100);

	 Bob.setPenColor(Color.BLACK);
	   Bob.move(a);
	   Bob.turn(90);
	   Bob.move(50);
	   Bob.turn(90);
	   Bob.move(a);
	   Bob.turn(-90);
	   Bob.setPenColor(Color.green);
	    Bob.move(50);
	    Bob.turn(-90);
   }
    void drawwHouse(String a) {
    	if(a.equals("Big")) {
    		drawHouse(100);
    	}
    }
    }
   
  

