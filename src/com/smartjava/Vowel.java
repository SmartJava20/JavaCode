package com.smartjava;

public class Vowel {
	
	public static void main(String args[]) {
	    String value = "Hello";
	    int count = 0;
	    StringBuilder nBuilder = new StringBuilder();

	    for (int i = 0; i < value.length(); i++) {
	        char ch = Character.toLowerCase(value.charAt(i));

	        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
	            count++;
	            nBuilder.append(ch);
	        }
	    }

	    System.out.println("Original input: " + value);
	    System.out.println("Vowels: " + nBuilder.toString());
	    System.out.println("Vowel Count: " + count);
	}

}

