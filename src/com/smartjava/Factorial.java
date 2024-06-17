package com.smartjava;

public class Factorial {
	
	public static void main(String args[]) {
		int input=5;
		
		int result=1;
		int data=0;
		for(int i=1; i<=input ; i++) {

			 data=result *=i;
		}
		
		System.out.println("factorial no is :" + data);
	}

}
