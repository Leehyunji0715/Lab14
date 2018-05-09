package edu.handong.csee.Lab14.prob2;

import java.util.InputMismatchException;//import java.util.InputMismatchException
import java.util.Scanner;//import java.util.Scanner

public class In_Exception extends Exception {//public modifier class named In_Exception which inherits Exception
	private int x,y;//call private modifier integer named x and y
	public void error() {//call method named error which returns nothing
		try {//try
			Scanner input = new Scanner(System.in);//instantiate Scanner class named input
			System.out.print("x : ");//print out x : 
			x = input.nextInt();//input integer to x
			System.out.print("y : ");//print out y :
			y = input.nextInt();//input integer to y
			System.out.println("x/y : "+x/y);//print out x/y
		}
		catch(ArithmeticException e){//if error which is ArithmeticException occurs 
			System.out.println("java.lang.ArithmeticException: " +e.getMessage());//print out "java.lang.ArithmeticException: " 
		}
		catch(InputMismatchException e) {//if error which is InputMismatchException occurs catch
			System.out.println("java.util.InputMismatchException");//print out "java.util.InputMismatchException"
		}
		catch(Exception e) {//if rest error occurs 
			System.out.println("Some other exception has occurred: " + e.getMessage()); //print out "Some other exception has occurred: "
		}
	}
	
}
