package _04_book_of_illusions;

import java.awt.Dimension;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frank = new JFrame();

	JLabel label;
	
	
	public void run() {
		int framewidth=2000;
		int frameheight=1000;
		
		
		// 2. make the frame visible
		frank.setVisible(true);
		// 3. set the size of the frame
	frank.setSize(framewidth,frameheight);
		// 4. find 2 images and save them to your project’s _06_book_of_illusions folder
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		label = loadImageFromComputer("6unp0b.jpg");
		// 7. use the "loadImage..." methods below to initialize your JLabel
		// 8. add your JLabel to the frame
		frank.add(label);
		// 9. call the pack() method on the frame
		frank.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
	frank.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked");
		// 12. remove everything from the frame that was added earlier
		frank.remove(label);
		int frameWidth = 2000;
		int frameHeight = 1000;
		// 13. load a new image like before (this is more than one line of code)
		JLabel label2;
		label2 = loadImageFromComputer("Hamster-Memes.jpg");
		// 14. pack the frame
		label2.setPreferredSize(new Dimension(frameWidth,frameHeight));
		frank.add(label2);
		frank.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


