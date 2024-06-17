package com.smartjava;

public class ReverseNumber {
	
	public static void main(String args[]) {
		int inputNo=1234;
		int outPutNo=reverseNumber(inputNo);
		
		System.out.println("Orignal NO"+ inputNo);
		System.out.println("Revesrse NO"+ outPutNo);
	}

	private static int reverseNumber(int inputNo) {
		int rev=0;
		while(inputNo!=0) {
			int digit=inputNo % 10;//last digit
		     rev=rev*10+digit;
		     inputNo/=10;// Remove the last digit from the original number
			
		}
	
		return rev;
	}

}
