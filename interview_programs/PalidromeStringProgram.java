package com.interview.questions;

public class PalidromeStringProgram {
	
	public static void main(String[] args) {
		
		String name = "chetan";
		int size = name.length();
		int i = size-1; 
		String NewName = ""; 
		System.out.println("Original name   : "+name);
		while(i>=0) {
			
			NewName = NewName + name.charAt(i);
			i--;
		}
		
		System.out.println("Reverse of name : "+NewName);
		
		
	}

}
