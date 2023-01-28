package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class e implements KeyListener{
 public static void main(String[] args) {
	 e e = new e();
	e.setup();
	
	
}
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		char currentLetter;

		void setup(){
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			currentLetter = generateRandomLetter();
			JLabel g = new JLabel();
			g.setText(""+currentLetter);
			g.setFont(g.getFont().deriveFont(28.0f));
			g.setHorizontalAlignment(JLabel.CENTER);
			frame.addKeyListener(this);
			panel.add(g);
			frame.add(panel);
			frame.pack();
		}
		
		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keyPressed = e.getKeyChar();
			if(keyPressed == currentLetter) {
				JOptionPane.showMessageDialog(null,"Correct!");
				panel.setBackground(Color.green);
		
			}
			else {
				panel.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "incorrect!");
			}
			
		}  
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			JLabel bond = new JLabel();
			currentLetter = generateRandomLetter();
			bond.setText(""+currentLetter);
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		
		
		}
}


