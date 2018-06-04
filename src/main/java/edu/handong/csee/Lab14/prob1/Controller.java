package edu.handong.csee.Lab14.prob1;

import java.util.Scanner;//import Scanner package

public class Controller {//public modifier class named Controller
   
	public static void main(String[] args) {//main method
		Scanner input = new Scanner(System.in);//instantiate Scanner class named input and get standard input device value(keyboard)
		SpeedLimiter sl = new SpeedLimiter();//instantiate SpeedLimiter class named sl 
		System.out.print("Set the speed limit, officer! : ");//print out to set speed limit
		sl.mSpeedSet = input.nextInt();//input integer value to sl's instance variable mSpeedSet
		sl.setRandomSpeed();//call sl's setRandomSpeed method
		sl.warnSpeedLimit();//call sl's warnSpeedLimit method
	}       

}
