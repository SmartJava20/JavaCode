package com.smartjava;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String args[]) {
		int[]  array1= {1,2,3,4};
		int[]  array2= {1,2,3,4};
		int[]  array3= {1,2,3,5};
		
		boolean equlasArray=Arrays.equals(array1, array2);
		boolean notEqual=Arrays.equals(array1, array3);
		
		System.out.println("Array1 and Array2 are equal: " + equlasArray);
        System.out.println("Array1 and Array3 are equal: " + notEqual);
	}
}
