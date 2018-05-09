package edu.handong.csee.Lab14.prob3;
import java.util.Scanner;//import Scanner package
public class Controller {//public modifier class named Controller

	public static void main(String[] args) {//main method
		int n, p;//call integer named n and p
		PowerCalc myCalculator = new PowerCalc();//instantiate PowerCalc class named myCalculator
		Scanner input = new Scanner(System.in);//instantiate Scanner class named input
		n=input.nextInt();//input integer to n variable
		p=input.nextInt();//input integer to p variable
		try {// use try statement when exception occurs(thrown caller - main)
			System.out.println(myCalculator.power(n,p));//print out value of power(n,p)
		}
		catch(Exception e) {//catch Exception
			System.out.println(e);//print out error message
		}

	}

}
