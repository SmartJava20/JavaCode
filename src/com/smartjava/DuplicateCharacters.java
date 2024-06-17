package com.smartjava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	
	public static void main(String args[]) {
		String input="hello";
		
		findDuplicate(input);
		
	}

	private static void findDuplicate(String input) {
		Set<Character> character=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		
		for(int i=0 ; i<input.length(); i++) {
			  char currentChar = input.charAt(i);
		
		
		if(!character.add(currentChar)) {
			duplicate.add(currentChar);
		}
		}
		
		System.out.println("duplication char :" + duplicate);
	}

}
