package edu.handong.csee.Lab14.prob5;
import java.util.Scanner;//import Scanner package
public class Controller {//public modifier class named Controller

	public static void main(String[] args) {//main method
		Scanner input = new Scanner(System.in);//instantiate Scanner class named input
		try{//try
	        String str = input.nextLine();//call String class type named str and input integer to it
	        Controller.myTest(str);//call Controller class' myTest method and give str value 
	        }
		catch(MyException e){//catch if MyException occurs
	         System.out.println("Inside catch block: " + e);//print out "Inside catch block: " 
	      }
	    }
	static void myTest(String str) throws MyException{//call static modifier method named myTest and it throws its error to MyException
	     if(str.equals("null")){//if str equals to "null"
	          throw new MyException("String val is null");//throw to MyException and give "String val is null"
	      }
	     else//or
	       System.out.println("String val is " + str);//print out "String val is"
	    }
	}

