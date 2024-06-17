package com.smartjava;

public class FindDuplicates {
	
	public static void main(String args[]) {
		int[] array= {1,2,3,4,4,5,1};
		
		
		for(int i=0; i<array.length ;i++) {
			int count=1;
			
			for(int j=i+1 ; j<array.length;j++) {
				
				if(array[i]== array[j]) {
					count++;
				}
				
			}
			
			if(count>1) {
				System.out.println(array[i] + " - count: " + count);
			}
		}
	}

}
