import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel chery = new JLabel();
	JLabel Apple = new JLabel();
	JLabel Mellon = new JLabel();
	JButton spin = new JButton("Spin!");
	Random reel = new Random();
	
	int reel1 = reel.nextInt(2);
	int reel2 = reel.nextInt(2);
	int ree3 = reel.nextInt(2);
	
	
	public static void main(String[] args) {
		
		SlotMachine setup = new SlotMachine();
		setup.setUp();
		
		
	}
	
	void setUp() {
		
		 //chery = loadImageFromComputer("Chery.jpg");
		 //Apple = loadImageFromComputer("apple.jpg");
		 //Mellon = loadImageFromComputer("mellon.jpeg");
		
		frame.add(panel);
		panel.add(spin);
		panel.add(Apple);
		panel.add(Mellon);
		panel.add(chery);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(0);
		frame.pack();
		
		if (reel1 == 0) {
			
			chery = loadImageFromComputer("Chery.jpg");
			
		} else if (reel1 == 1){
			
			chery = loadImageFromComputer("apple.jpg");
			
		} else {
			
			chery = loadImageFromComputer("mellen.jpeg");
			
		}
		
		
	}
	
	
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	
	
}
