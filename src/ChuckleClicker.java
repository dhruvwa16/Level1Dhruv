import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton Button1;
	JButton Button2;
 public static void main(String[] args) {
	ChuckleClicker hi = new ChuckleClicker();
    hi.makeChuckClickers();
}
    void makeChuckClickers() {
	 frame = new JFrame("Im better than Adwit");
     panel = new JPanel();
     Button1 = new JButton("Joke");
     Button2 = new JButton("Punchline");
     frame.add(panel);
     panel.add(Button1);
     panel.add(Button2);
     frame.setVisible(true);
     Button1.addActionListener(this);
     Button2.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// TODO Auto-generated method stub
		if(arg0.getSource() == Button1){
		JOptionPane.showMessageDialog(null, "What’s black, red, black, red, black, red?");
		}
		if(arg0.getSource() == Button2){
		JOptionPane.showMessageDialog(null, "A zebra with a sun burn");
		
}
}
}