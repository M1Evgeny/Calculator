package by.pvt.consoleCalculator.scanner;

import java.util.Scanner;

public class InputRead {

	Scanner sc = new Scanner(System.in);
	private int one;
	private double doubleOne;
	private String stringOne;
	private int two;
	private double doubleTwo;
	private String stringTwo;
	private String arithmeticOperation;

	public void setFirstNumber() {
		try {
			one = sc.nextInt();
		} catch (IllegalArgumentException e) {
			try {
				doubleOne = sc.nextDouble();
			} catch (IllegalArgumentException ex) {
				stringOne = sc.next();
			}
		}
	}

	public void setSecondNumber() {
		try {
			two = sc.nextInt();
		} catch (IllegalArgumentException e) {
			try {
				doubleTwo = sc.nextDouble();
			} catch (IllegalArgumentException ex) {
				stringTwo = sc.next();
			}
		}
	}

	public void setArithmeticOperation() {
		try {
			arithmeticOperation = sc.next();
		} catch (IllegalArgumentException e) {
			System.out.println("");
		}
	}
}
