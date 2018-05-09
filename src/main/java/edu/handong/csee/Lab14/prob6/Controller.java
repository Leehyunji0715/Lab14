package edu.handong.csee.Lab14.prob6;
import java.util.Scanner;//import java.util.Scanner
public class Controller {//public modifier class named Controller

	public static void main(String[] args) {//call main method
		Scanner input = new Scanner(System.in);//instantiate Scanner class
		String name, race;//call String class type named name and race
		int age = 0;//call integer named age
		CustomID obj = new CustomID();//instantiate CustomID class named obj
		int i=0;//call integer named i
		while(i<=2){//while i<=2
			try {//try
				System.out.print("Enter your name: ");//print out to enter user's name
				name = input.nextLine();//input entered String to name 
				obj.recieveName(name);//call obj's recieveName method given name value
				System.out.print("Enter your age: ");//print out to enter user's age
				age = input.nextInt();//input entered integer value to age
				input.nextLine();//get enter after calling nextInt()
				obj.recieveAge(age);//call obj's recieveAge method given age value
				System.out.print("Enter your race: ");//print out to enter user's race
				race = input.nextLine();//input entered value to race 
				obj.recieveRace(race);//call obj's recieveRace method given race value
			}
			catch(Exception e){//catch Exception
				System.out.println(e.getMessage());//print out each error message
				continue;//continue loop(start again)
			}
		i++;//increase i
			}
		}
	}
