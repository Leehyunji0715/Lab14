package edu.handong.csee.Lab14.prob6;

	public class CustomID {//public class modifier named CustomID
		String [] mRace = new String[] {"Vulcans", "Romulan", "Klingons"}; //pre call that mRace has "Vulcans", "Romulan", "Klingons"
		String mName, stateRace;//call String class type named mName and stateRace
		int mAge;//call integer named mAge

		void recieveName(String str) throws Exception {//method named recieveName which returns nothing and gets String str
			if(str.length()<5) {//if str length is smaller than 5
				throw new Exception("Your name is short! Try again!");//throw Exception with "Your name is short! Try again!"
			}
			else {//else
				mName = str;//input str to mName
				System.out.println("Name is valid");//print out "Name is valid"
				System.out.println("Name : "+mName);//print out "Name : ~~"
			}
		}
		void recieveAge(int num) throws Exception{//recieveAge method which returns nothing and gets num. Also, it throws Exception to caller
			if(num<18) {//if num is smaller than 18
				throw new Exception("You are too young! Try again!");//print out "You are too young! Try again!"
			}
			else {
				mAge = num;//input num to mAge
				System.out.println("Age is valid");//print out "Age is valid"
				System.out.println("Age: " + mAge);//print out "Age: " + mAge
			}
		}
		void recieveRace(String race) throws Exception{//method named recieveRace which returns nothing and gets race String. Also, it throws error Exception to caller 
			for(int i = 0; i < mRace.length; i++)//repeat the number of mRace array
			{
				if(mRace[i].equals(race)) {//if mRace[i] is equal to current race value
					stateRace = mRace[i];//input mRace[i] to stateRace
					System.out.println("Race is valid");//print out Race is valid"
					System.out.println("Race: " + mRace[i]);//print out Race : ~~
					return;//end method
				}
			}
			throw new Exception("Human! Try again.");//else, throw Exception with "Human! Try again."
			}

		}
