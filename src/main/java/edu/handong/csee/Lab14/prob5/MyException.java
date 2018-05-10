package edu.handong.csee.Lab14.prob5;

public class MyException extends Exception {//MyException inherits Exception
	private String message = null;//private modifier String class named message which is null
	
    public MyException() {//constructor
        super();//call super class's Constructor
    }
    
    public MyException(String message) {//public modifier class named MyException which gets String message
        super(message);//call super class' constructor given message string
        this.message = message;//get present instance variable 'message' message
    }
 
    public MyException(Throwable cause) {//constructor which gains Throwable class, and this means making my own Exception
        super(cause);//call super class which given cause value
    }
 
    public String toString() {//call overridden method which returns String
        return message;//return message
    }
}
