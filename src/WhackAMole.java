import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackAMole implements ActionListener{

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	

	
	
	public static void main(String[] args) {
		WhackAMole pig = new WhackAMole();
		pig.setUp();
		
	}
	
	void setUp() {
		
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		String cool  = JOptionPane.showInputDialog("WHat is the number?(0 - 500)");
		int num = Integer.parseInt(cool);
		makeButtons(num);
	
	
}
	
	void makeButtons(int mole) {
		
		for (int i = 0; i < 647; i++) {
			
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			
			if (i == mole) {
				
				JButton button1 = new JButton("mole");
				button1.addActionListener(this);
				panel.add(button1);
				
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
		JButton buttonPressed = (JButton)e.getSource();
		if (buttonPressed.getText() .equals("mole") ) {
			
			speak("ouch");
			
			
			
		} else {
			
			speak("ha");
			
		}
		
		
		
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

	
}
