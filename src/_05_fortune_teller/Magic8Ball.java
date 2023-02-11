package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int random;
	random = new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
	String answer = JOptionPane.showInputDialog("Ask A Question");
	// 5. If the random number is 0
	if (random == 0) {
	
		answer = "Yes";
		JOptionPane.showMessageDialog(null, answer);
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1
	if (random == 1)
	{
		answer = "No";
		JOptionPane.showMessageDialog(null, answer);
	}
	// -- tell the user "No"

	// 7. If the random number is 2
	if (random == 2) {
		answer="Maybe you should ask Google?";
		JOptionPane.showMessageDialog(null, answer);
	}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
	if (random == 3) {
		answer="Man I dont know! Quit asking me questions";
		JOptionPane.showMessageDialog(null, answer);
	}
	// -- write your own answer

}
	}
