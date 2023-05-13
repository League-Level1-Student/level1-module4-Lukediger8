package _09_whack_a_mole;

import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whack_a_mole {
	public static void main(String[] args) {

		JFrame frame = new JFrame();

		JPanel panel = new JPanel();

		int f= 50;
		int g= 20;

		JButton button = new JButton();
		panel.add(button);
		JButton button1 = new JButton();
		panel.add(button1);
		JButton button2 = new JButton();
		panel.add(button2);
		JButton button3 = new JButton();
		panel.add(button3);
		JButton button4 = new JButton();
		panel.add(button4);
		JButton button5 = new JButton();
		panel.add(button5);
		JButton button6 = new JButton();
		panel.add(button6);
		JButton button7 = new JButton();
		panel.add(button7);
		JButton button8 = new JButton();
		panel.add(button8);
		JButton button9 = new JButton();
		panel.add(button9);
		JButton button10 = new JButton();
		panel.add(button10);
		JButton button11 = new JButton();
		panel.add(button11);
		JButton button12 = new JButton();
		panel.add(button12);
		JButton button13 = new JButton();
		panel.add(button13);
		JButton button14 = new JButton();
		panel.add(button14);
		JButton button15 = new JButton();
		panel.add(button15);
		JButton button16 = new JButton();
		panel.add(button16);
		JButton button17 = new JButton();
		panel.add(button17);
		JButton button18 = new JButton();
		panel.add(button18);
		JButton button19 = new JButton();
		panel.add(button19);
		JButton button20 = new JButton();
		panel.add(button20);
		JButton button21 = new JButton();
		panel.add(button21);
		JButton button22 = new JButton();
		panel.add(button22);
		JButton button23 = new JButton();
		panel.add(button23);


		frame.setSize(600,558);

		panel.setSize(600,558);	

		frame.add(panel);



		frame.setVisible(true);

		panel.setVisible(true);

		button.setVisible(true);

		button1.setVisible(true);

		button2.setVisible(true);

		button3.setVisible(true);

		button4.setVisible(true);

		button5.setVisible(true);

		button6.setVisible(true);

		button7.setVisible(true);

		button8.setVisible(true);

		button9.setVisible(true);

		button10.setVisible(true);

		button11.setVisible(true);

		button12.setVisible(true);

		button13.setVisible(true);

		button14.setVisible(true);

		button15.setVisible(true);

		button16.setVisible(true);

		button17.setVisible(true);

		button18.setVisible(true);

		button19.setVisible(true);

		button20.setVisible(true);

		button21.setVisible(true);

		button22.setVisible(true);

		button23.setVisible(true);

		button.setPreferredSize(new Dimension(f,g));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Random rand = new Random();
		int save = rand.nextInt(24);

		if(save == 1) {
			button.setText("mole!");
		}
		if(save == 2) {
			button1.setText("mole!");
		}
		if(save == 3) {
			button2.setText("mole!");
		}
		if(save == 4) {
			button3.setText("mole!");
		}
		if(save == 5) {
			button4.setText("mole!");
		}
		if(save== 6) {
			button5.setText("mole!");
		}
		if(save== 7) {
			button6.setText("mole!");
		}
		if(save== 8) {
			button7.setText("mole");
		}
		if(save== 9 ) {
			button8.setText("mole!");
		}
		if( save == 10) {
			button9.setText("mole!");
		}
		if(save==11) {
			button10.setText("mole!");
		}
		if(save==12) {
			button11.setText("mole!");
		}
		if(save==13) {
			button12.setText("mole!");
		}
		if(save==14) {
			button13.setText("mole!");
		}
		if(save==15) {
			button14.setText("mole!");
		}
		if(save==16) {
			button15.setText("mole!");
		}
		if(save==17) {
			button16.setText("mole!");
		}
		if(save==18) {
			button17.setText("mole!");
		}
		if(save==19) {
			button18.setText("mole!");
		}
		if(save==20) {
			button19.setText("mole!");
		}
		if(save==21) {
			button20.setText("mole!");
		}
		if(save==22) {
			button21.setText("mole!");
		}
		if(save==23) {
			button22.setText("mole!");
		}
		if(save==24) {
			button23.setText("mole!");
		}
	}

}
