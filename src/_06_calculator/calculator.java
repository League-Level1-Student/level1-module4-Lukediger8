package _06_calculator;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

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
		
		add.setText("add");
		sub.setText("sub");
		multi.setText("multi");
		div.setText("div");
		
		operators.add(add);
		operators.add(sub);
		operators.add(multi);
		operators.add(div);
		
		Dimension outputPanelSize1 = new Dimension(400, 40);
		output.setPreferredSize(outputPanelSize1);
		panel.add(output);
		
		output.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		output.setPreferredSize(outputPanelSize1);
		output.setText("Output");
		
		frame.pack();
	}
	
	int add(int num1, int num2) {
		int output;
		output = num1 + num2;
		return output;
	}
	
	int sub(int num1, int num2) {
		int output;
		output = num1 - num2;
		return output;
	}
	
	int multi(int num1, int num2) {
		int output;
		output = num1 * num2;
		return output;
	}
	
	int div(int num1, int num2) {
		int output;
		output = num1 / num2;
		return output;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressedButton = (JButton) e.getSource();
		
		int num1 = Integer.parseInt(input0.getText());
		int num2 = Integer.parseInt(input1.getText());
		
		if(pressedButton == add)
		{
			output.setText(add(num1, num2) + "");
		}
		if(pressedButton == sub)
		{
			output.setText(sub(num1, num2) + "");
		}
		if(pressedButton == multi)
		{
			output.setText(multi(num1, num2) + "");
		}
		if(pressedButton == div)
		{
			output.setText(div(num1, num2) + "");
		}
	}
		
}

