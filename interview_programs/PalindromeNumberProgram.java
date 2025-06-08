package com.interview.questions;

public class PalindromeNumberProgram {

	public static void main(String[] args) {
		int num = 234,rem,rev=0;
		
		while(num>0) {
			
			rem = num%10;
			rev = rev*10+rem;
			num=num/10;
			
		}System.out.println("Reverse of a Number : "+rev);

	}

}
