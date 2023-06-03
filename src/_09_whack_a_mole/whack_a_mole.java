package _09_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whack_a_mole implements ActionListener {	

	
	

	void stuff() {
		JFrame frame = new JFrame();

		JPanel panel = new JPanel();
		
		int f= 90;
		int g= 40;


		frame.setSize(600,558);

		panel.setSize(600,558);	

		frame.add(panel);



		frame.setVisible(true);

		panel.setVisible(true);

		Random rand = new Random();
		int save = rand.nextInt(24);
		
		
		for(int i=0; i<24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			button.setVisible(true);
			button.setVisible(true);
			button.setPreferredSize(new Dimension(f,g));
			if(save == i) {
				button.setText("mole!");
				
			}	
		}
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		stuff();
	}
}
