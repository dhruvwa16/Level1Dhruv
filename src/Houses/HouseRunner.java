package Houses;

import java.awt.Color;

import javax.swing.JOptionPane;

public class HouseRunner {
    public static void main(String[] args) {
	
	HouseBuilder Bob = new HouseBuilder();
	Bob.moveToBottomLeftCorner();

		
		
	   for (int i = 0; i < 10; i++) {
		
	String a = JOptionPane.showInputDialog("Enter a height");
	int b = Integer.parseInt(a);
	Bob.drawHouse(b);
	   }
    
}
}
