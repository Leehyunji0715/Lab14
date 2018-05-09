package edu.handong.csee.Lab14.prob4;
import java.util.Scanner;//import Scanner package

public class Controller {//public modifier class named Controller

	public static void main(String[] args) {//main method
		Boundary test_boundary = new Boundary();//instantiate Boundary class named test_boundary
		Scanner input = new Scanner(System.in);//instantiate Scanner class named input and get value of standard input device
		while(true) {//repeat infinitely
			try {// try
					System.out.print("Enter an integer : ");//print out to enter value
					test_boundary.receiveValue(input.nextInt());//input entered integer to recieveValue method
			}
			catch(ArrayIndexOutOfBoundsException e){// catch ArrayIndexOutOfBoundaryException named e
				System.out.println("Invalid array index access! ");//if error occurs, print out "Invalid array Index access!"
				break;//exit the loop
			}
		}
	}

}
