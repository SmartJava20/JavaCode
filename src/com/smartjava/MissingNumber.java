package com.smartjava;

public class MissingNumber {
	
	public static void main(String args[]) {
		
		int[] no = {1, 2, 3, 5, 6}; // 4 is missing
	    int sum = 0;

	    for (int i = 0; i < no.length; i++) {
	        sum += no[i];
	    }

	    int no1 = 6;
	    int sum2 = 0;

	    for (int i = 1; i <= no1; i++) {
	        sum2 += i;
	    }

	    int missingValue = sum2 - sum;

	    System.out.println("MissingNumber is " + missingValue);
		
	}

}
