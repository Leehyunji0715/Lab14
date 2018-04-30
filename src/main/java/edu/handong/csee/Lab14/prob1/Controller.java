package edu.handong.csee.Lab14.prob1;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		SpeedLimiter sl = new SpeedLimiter();
		System.out.print("Set the speed limit, officer! : ");
		sl.mSpeedSet = input.nextInt();
		sl.setRandomSpeed(sl.mSpeedSet);
		sl.warnSpeedLimit();
	}

}
