package edu.handong.csee.Lab14.prob1;

public class SpeedLimiter extends Exception{//public modifier class naemd SpeedLimiter and inherits Exception class
	int mSpeedSet;//call instance variable named mSpeedSet
	int randomSpeed;//call instance variable named randomSpeed
	        
	public void setRandomSpeed(){//call public modifier method named setRandomSpeed which returns nothing
		randomSpeed = (int)(Math.random()*101);	//input random value(0~100) into randomSpeed
	}     
	void warnSpeedLimit() {//method named warnSpeedLimit and returns nothing
		try {//try
			if(randomSpeed>mSpeedSet) {//if randomSpeed is higher than mSpeedSet
				throw new Exception ("Speed Limit : "+mSpeedSet);//throw exception delivering String(Speed Limit : )
			}
			System.out.println("you are a good citizen");//print out good citizen
		}
		catch(Exception e) {//catch throw statement and declare Exception class as e
			System.out.println("Speed limit "+mSpeedSet+"km exceeded!");//print out speed limit is exceeded
			System.out.println("you are being fined");//print out user being fined
		}     
		System.out.println("your current speed is "+randomSpeed+" km");//print out current speed
	}       
}
