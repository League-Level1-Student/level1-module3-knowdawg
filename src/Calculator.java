import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
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
		panel.add(add);
		panel.add(mul);
		panel.add(div);
		panel.add(sub);

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

			System.out.println(add(1, 1));

		} else if (e.getSource() == sub) {

			System.out.println(subtract(1, 1));

		} else if (e.getSource() == mul) {

			System.out.println(multiply(1, 1));

		} else if (e.getSource() == div) {

			System.out.println(divide(1, 1));

		}

	}

}
