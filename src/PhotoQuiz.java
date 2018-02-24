 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
          String Nole = "http://sportsrediscovered.com/wp-content/uploads/2015/06/Novak-Djokovic-12.jpg";
		// 2. create a variable of type "Component" that will hold your image
         Component Novak;
         
		// 3. use the "createImage()" method below to initialize your Component
       Novak = createImage(Nole);
        
        
		// 4. add the image to the quiz window
          quizWindow.add(Novak);
		// 5. call the pack() method on the quiz window
          quizWindow.pack();
		// 6. ask a question that relates to the image
          String b = JOptionPane.showInputDialog("Who is this tennis player");
          if(b.equals("Novak Djokovic")) {
        	  JOptionPane.showMessageDialog(null ,"Correct You are a genius.");
         }
         else {
        	 JOptionPane.showMessageDialog(null,"Incorrect You don't know anything. The correct answer is Novak Djokovic ");
         }
         
          String a = JOptionPane.showInputDialog("How many grand slams did he win in a row. Answer in number form");
		// 7. print "CORRECT" if the user gave the right answer
           if(a.equals("4")) {
        	   JOptionPane.showMessageDialog(null,"Correct You are a genius.");
           }
           else {
        	   JOptionPane.showMessageDialog(null,"Incorrect You dont know anything. The correct answer is 4");
           }
           
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
           quizWindow.remove(Novak);
		// 10. find another image and create it (might take more than one line of code)
           String Goat = "https://static.independent.co.uk/s3fs-public/thumbnails/image/2014/01/23/16/2009-nad.jpg";
   		// 2. create a variable of type "Component" that will hold your image
            Component Federer;
            
   		// 3. use the "createImage()" method below to initialize your Component
          Federer = createImage(Goat);
           
           
   		// 4. add the image to the quiz window
             quizWindow.add(Federer);
   		// 5. call the pack() method on the quiz window
             quizWindow.pack();
   		// 6. ask a question that relates to the image
             String c = JOptionPane.showInputDialog("Who is this tennis player");
             if(c.equals("Roger Federer")) {
           	  JOptionPane.showMessageDialog(null ,"Correct You are a genius.");
            }
            else {
           	 JOptionPane.showMessageDialog(null,"Incorrect You don't know anything. The correct answer is Roger Federer");
            }
            
             String d = JOptionPane.showInputDialog("Who did he lose to in this match.");
   		// 7. print "CORRECT" if the user gave the right answer
              if(d.equals("Rafael Nadal ")) {
           	   JOptionPane.showMessageDialog(null,"Correct You are a genius.");
              }
              else {
           	   JOptionPane.showMessageDialog(null,"Incorrect You dont know anything. The correct answer is Rafael Nadal");
              }
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
