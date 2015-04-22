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
	// define buttons
	private JButton bZero = new JButton("0");
	private JButton bOne = new JButton("1");
	private JButton bTwo = new JButton("2");
	private JButton bThree = new JButton("3");
	private JButton bFour = new JButton("4");
	private JButton bFive = new JButton("5");
	private JButton bSix = new JButton("6");
	private JButton bSeven = new JButton("7");
	private JButton bEight = new JButton("8");
	private JButton bNine = new JButton("9");
	private JButton bAdd = new JButton("+");
	private JButton bSubtract = new JButton("-");
	private JButton bMultiply = new JButton("X");
	private JButton bDivide = new JButton("÷");
	private JButton bDecimal = new JButton(".");

	private FlowLayout displayLayout = new FlowLayout(FlowLayout.CENTER);
	private JTextField display = new JTextField(30);
	private Container con = getContentPane();

	public CalculatorSimple()
	{
		super("Simple Calculator");
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