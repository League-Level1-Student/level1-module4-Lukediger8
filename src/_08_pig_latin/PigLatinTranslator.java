package _08_pig_latin;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {

	/**
	 * Method to translate a english to pig latin.
	 * 
	 * @param s
	 *            The sentence in English
	 * @return The pig latin version
	 */
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JButton speak;
	JTextField text;
	JTextField text2;

	void MakeButtons() {

		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		panel.setVisible(true);

		button = new JButton();
		button.setText(">>");
		button.addActionListener(this);

		button2 = new JButton();
		button2.setText("<<");
		button2.addActionListener(this);

	

		text = new JTextField(20);

		text.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("The entered text is: " + text.getText());
			}
			
		});
		
		text2 = new JTextField(20);
		text2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("The entered text is: " + text.getText());
			}
			
		});

		speak = new JButton();
		speak.setText("speak");
		speak.addActionListener(this);
		
		panel.add(text);
		panel.add(button);
		panel.add(button2);
		panel.add(speak);
		panel.add(text2);
		frame.add(panel);
		frame.pack();
	
		
	}

	public static String translateEnglishToPigLatin(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {
			// Take care of punctuation and spaces
			while (i < s.length() && !isLetter(s.charAt(i))) {
				latin = latin + s.charAt(i);
				i++;
			}
			// If there aren't any words left, stop.
			if (i >= s.length())
				break;
			// Otherwise we're at the beginning of a word.
			int begin = i;
			while (i < s.length() && isLetter(s.charAt(i))) {
				i++;
			}
			// Now we're at the end of a word, so translate it.
			int end = i;
			latin = latin + pigWord(s.substring(begin, end));
		}
		return latin;
	}

	/**
	 * Method to translate a pig latin to english.
	 * 
	 * @param s
	 *            The sentence in pig latin
	 * @return The english version
	 */
	public static String translatePigLatinToEnglish(String s) {
		String english = "";

		String[] words = s.split(" ");

		for (String word : words) {
			String[] hyphenSplit = word.split("-");
			String translatedWord = word;
			String punctuation = "";

			if (hyphenSplit.length == 2) {
				if (hyphenSplit[1].startsWith("ay")) {
					// Started with a vowel

					translatedWord = hyphenSplit[0];
				} else {
					// Started with a consonant

					translatedWord = hyphenSplit[1].substring(0, firstVowel(hyphenSplit[1])) + hyphenSplit[0];
				}

				// Handle punctuation at the end of a word
				int lastLetterIndex = hyphenSplit[1].length() - 1;

				while (!Character.isLetter(hyphenSplit[1].charAt(lastLetterIndex))) {
					lastLetterIndex -= 1;
				}

				punctuation = hyphenSplit[1].substring(lastLetterIndex + 1);
			}

			// Add word
			if (english.isEmpty()) {
				english += translatedWord + punctuation;
			} else {
				english = english + " " + translatedWord + punctuation;
			}
		}

		return english;
	}

	/**
	 * Method to test whether a character is a letter or not.
	 * 
	 * @param c
	 *            The character to test
	 * @return True if it's a letter
	 */
	private static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}

	/**
	 * Method to translate one word into pig latin.
	 * 
	 * @param word
	 *            The word in english
	 * @return The pig latin version
	 */
	private static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split) + "-" + word.substring(0, split) + "ay";
	}

	/**
	 * Method to find the index of the first vowel in a word.
	 * 
	 * @param word
	 *            The word to search
	 * @return The index of the first vowel
	 */
	private static int firstVowel(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')
				return i;
		return 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) arg0.getSource();
		if (pressed == button) {
			String w = text.getText();
			String translated = translateEnglishToPigLatin(w);
			text2.setText(translated);
				
			}

		if (pressed == button2) {
			String k = text.getText();
			String translatev = translatePigLatinToEnglish(k);
			text2.setText(translatev);	
	}
		
	}
	
}
	
	

