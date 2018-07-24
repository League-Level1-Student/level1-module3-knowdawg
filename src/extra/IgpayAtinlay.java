package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IgpayAtinlay implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField field = new JTextField(20);
	JButton button = new JButton("translate");
	
	
	public static void main(String[] args) {
		
		IgpayAtinlay pig = new IgpayAtinlay();
		pig.setUp();
		
	}
	
	public void setUp() {
		
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(label);
		button.addActionListener(this);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(0);
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	
	