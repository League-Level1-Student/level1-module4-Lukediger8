package _06_calculator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel input = new JPanel();
	JPanel operators = new JPanel();
	JLabel output = new JLabel();
	JTextField input0 = new JTextField();
	JTextField input1 = new JTextField();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton multi = new JButton();
	JButton div = new JButton();
	int Height = 400;
	int Length = 250;
	void run(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(Height,Length);
	frame.add(panel);
	
	Dimension inputPanelSize = new Dimension(350,90);
	input.setPreferredSize(inputPanelSize);
	panel.add(input);
	
	Dimension inputSize = new Dimension(180, 30);
	input0.setPreferredSize(inputSize);
	
	
	Dimension inputSize1 = new Dimension(180,30);
	input0.setPreferredSize(inputSize);
	input1.setPreferredSize(inputSize1);
	
	input.add(input0);
	input.add(input1);
	 Dimension operatorsPanelSize = new Dimension(400, 40);
     operators.setPreferredSize(operatorsPanelSize);
		panel.add(operators);
		 
		Dimension buttonSize = new Dimension(90, 30);
		add.setPreferredSize(buttonSize);
		sub.setPreferredSize(buttonSize);
		multi.setPreferredSize(buttonSize);
		div.setPreferredSize(buttonSize);
	
	Dimension outputPanelSize = new Dimension(400, 40);
		output.setPreferredSize(outputPanelSize);
		panel.add(output);
		
		add.setText("Add");
		sub.setText("Sub");
		multi.setText("Multi");
		div.setText("Div");
		
		operators.add(add);
		operators.add(sub);
		operators.add(multi);
		operators.add(div);
	}
}
