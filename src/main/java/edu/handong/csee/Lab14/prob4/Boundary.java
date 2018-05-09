package edu.handong.csee.Lab14.prob4;

public class Boundary {//public modifier class named Boundary 
	int[] arr = new int[5];// call integer array named arr and its size is 5
	int i=0;//call integer i and initiate it with 0
	void receiveValue(int n) throws ArrayIndexOutOfBoundsException{//call method named recieveValue which gets integer and returns nothing also, it throw its exception to caller 
			arr[i]=n;//input n value to arr[i]
			System.out.printf("arr[%d] <- %d\n",i,arr[i]);//print out status of arr[i]
			i++;	//increase i one by one
		}
	}
