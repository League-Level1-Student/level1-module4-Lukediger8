package _10_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class slot_machine {
JButton SPIN = new JButton();
JPanel panel = new JPanel();	
JFrame frame = new JFrame();
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
		}
	}

void stuff() {
int f= 90;
int g=40;
	
SPIN.addActionListener(l);
frame.add(panel);
panel.add(SPIN);
frame.setSize(600,558);
panel.setSize(600,558);
SPIN.setSize(f,g);
SPIN.setVisible(true);
frame.setVisible(true);
panel.setVisible(true);
}
}