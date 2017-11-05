import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JButton mole = new JButton();
	JFrame frame = new JFrame();
	int a = 0;

	public static void main(String[] args) {
		WhackAMole i = new WhackAMole();
		i.mole();
	}

	void mole() {
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.pack();
		frame.setSize(100, 100);
		panel.setLayout(new GridLayout(3, 8));
		Random gen = new Random();
		int num = gen.nextInt(24);
		mole = null;
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (num == i) {
				mole = button;
				mole.setText("mole");
			}

		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mole) {
			a++;
			speak("you did it");
		} else {
			speak("dork");
		}
		frame.dispose();
		frame = new JFrame();
		mole();
		
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
