import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {


	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Translate");
	JTextField field = new JTextField(10);
	JLabel label = new JLabel();
	
	
	public static void main(String[] args) {
		PigLatin pig = new PigLatin();
		pig.setUp();
		
	}
	
	void setUp() {
		
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
		
		PigLatinTranslator pigy = new PigLatinTranslator();
		
		String answer = pigy.translate(field.getText());
		
		label.setText("" + answer);
		System.out.println("" + answer);
		
	}
	
	



}
