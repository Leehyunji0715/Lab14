package edu.handong.csee.Lab14.prob3;

public class PowerCalc {//public modifier class named PowerCalc
	long mResult;// call long type variable named mResult
	public long power(int n,int p) throws Exception {// throw Exception to caller
		mResult = (long)Math.pow((double)n, (double)p);//power(n,p) and change its value to long type
		if(n < 0 || p < 0)//if n<0 or p<0
        {
            throw new Exception("n or p should not be negative.");// throw error message "n or p should not be negative."
        }
        if(n == 0 && p == 0)//if n==0 and p==0
        {
            throw new Exception("n and p should not be zero.");//throw error message "n and p should not be zero."
        }
		return mResult;// return mResult value
	}
}
