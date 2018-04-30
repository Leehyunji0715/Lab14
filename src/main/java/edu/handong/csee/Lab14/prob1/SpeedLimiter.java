package edu.handong.csee.Lab14.prob1;

public class SpeedLimiter extends Exception{
	int mSpeedSet;
	int randomSpeed;
	
	public void setRandomSpeed(int speedSet){
		randomSpeed = (int)(Math.random()*101);	
	}
	void warnSpeedLimit() {
		try {
			if(randomSpeed>mSpeedSet) {
				throw new Exception ("Speed Limit : "+mSpeedSet);
			}
			System.out.println("you are a good citizen");
		}
		catch(Exception e) {
			System.out.println("Speed limit "+mSpeedSet+"km exceeded!");
			System.out.println("you are being fined");
		}
		System.out.println("your current speed is "+randomSpeed+" km");
	}
}
