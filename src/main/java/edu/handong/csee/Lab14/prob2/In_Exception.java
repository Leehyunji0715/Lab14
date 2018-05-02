package edu.handong.csee.Lab14.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_Exception extends Exception {
	private int x,y;
	public void error() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("x : ");
			x = input.nextInt();
			System.out.print("y : ");
			y = input.nextInt();
			System.out.println("x/y : "+x/y);
		}
		catch(ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: " +e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Some other exception has occurred: " + e.getMessage());
		}
	}
	
}
