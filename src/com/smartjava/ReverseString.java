package com.smartjava;

public class ReverseString {

	public static void main(String args[]) {
		String input="hello";
		String output=reverseString(input);
		
		System.out.println("input String := " + input);
		System.out.println("output String := " + output);
	}

	private static String reverseString(String input) {
		StringBuilder reverve=new  StringBuilder(input.length());
		
		for(int i=input.length() -1; i>=0 ;i--) {
			reverve.append(input.charAt(i));
		}
		
		return reverve.toString();
		
		
	}
}
