package edu.handong.csee.Lab14.prob6;
import java.util.Scanner;//import java.util.Scanner
public class Controller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//instantiate Scanner class
		String name, race;
		int age = 0;
		CustomID obj = new CustomID();
		int i=0;
		while(i<=2){
		try {
		System.out.print("Enter your name: ");
		name = input.nextLine();
		obj.recieveName(name);
		System.out.print("Enter your age: ");
		age = input.nextInt();
		input.nextLine();
		obj.recieveAge(age);
		System.out.print("Enter your race: ");
		race = input.nextLine();
		obj.recieveRace(race);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			continue;
			}
			}
			}
	}

}
