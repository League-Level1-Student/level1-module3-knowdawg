import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JButton mul = new JButton();
	JButton div = new JButton();
	JButton add = new JButton();
	JButton sub = new JButton();

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.setUp();

	}

	public void setUp() {

		frame.add(panel);
		frame.setVisible(true);
		panel.add(text1);
		panel.add(text2);
		panel.add(add);
		panel.add(mul);
		panel.add(div);
		panel.add(sub);
		frame.pack();

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");

		frame.setDefaultCloseOperation(0);

	}

	public int multiply(int num1, int num2) {
		
	
		


		return (num1 * num2);

	}

	public int divide(int num1, int num2) {

		return (num1 / num2);

	}

	public int add(int num1, int num2) {

		return (num1 + num2);

	}

	public int subtract(int num1, int num2) {

		return (num1 - num2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == add) {
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());
			System.out.println(add(num1, num2));
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("creepy-noise.wav"));
			sound.play();

		} else if (e.getSource() == sub) {
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());
			System.out.println(subtract(num1, num2));
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("creepy-noise.wav"));
			sound.play();

		} else if (e.getSource() == mul) {
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());
			System.out.println(multiply(num1, num2));
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("moo.wav"));
			sound.play();

		} else if (e.getSource() == div) {
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());
			System.out.println(divide(num1, num2));
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("moo.wav"));
			sound.play();

		}

	}

}
