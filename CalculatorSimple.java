/*
Carlos F. Meneses
04/14/2015
Bergen Community College
Advanced Java Programming
*/
/**
CalculatorSimple.java: Creates a basic calculator using the Java GUI component 
GridLayout and FlowLayout. App performs basic four function (add, subtract, 
muultiply, and divide) on two integers and display the result. GUI bases on the 
keyboard layout of the Busicom LE-120A "HANDY-LE", except "=" has been ommited, 
since app only excepts 2 integers.
*/

import javax.swing.*;
import java.awt.*;

public class CalculatorSimple extends JFrame
{
	private JTextField display;

	public CalculatorSimple()
	{
		super("Simple Calculator");

		// define display
		display = new JTextField("0", 30);
		display.setHorizontalAlignment(JTextField.RIGHT);

		// define buttons
		JButton bZero = new JButton("0");
		JButton bOne = new JButton("1");
		JButton bTwo = new JButton("2");
		JButton bThree = new JButton("3");
		JButton bFour = new JButton("4");
		JButton bFive = new JButton("5");
		JButton bSix = new JButton("6");
		JButton bSeven = new JButton("7");
		JButton bEight = new JButton("8");
		JButton bNine = new JButton("9");
		JButton bAdd = new JButton("+");
		JButton bSubtract = new JButton("-");
		JButton bMultiply = new JButton("X");
		JButton bDivide = new JButton("÷");
		JButton bDecimal = new JButton(".");

		FlowLayout displayLayout = new FlowLayout(FlowLayout.CENTER);
		Container con = getContentPane();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		con.setLayout(displayLayout);
		con.add(display);

		con.add(bSeven);
		con.add(bEight);
		con.add(bNine);
		con.add(bMultiply);

		con.add(bFour);
		con.add(bFive);
		con.add(bSix);
		con.add(bDivide);

		con.add(bOne);
		con.add(bTwo);
		con.add(bThree);
		con.add(bSubtract);

		con.add(bZero);
		con.add(new JLabel());
		con.add(bDecimal);
		con.add(bAdd);
		con.add(bAdd);

		setSize(375,200);
		// setResizable(false);
	}

	public static void main(String[] args) 
	{
		CalculatorSimple frame = new CalculatorSimple();
		frame.setVisible(true);
	}
}