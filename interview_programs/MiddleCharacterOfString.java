package com.interview.questions;

public class MiddleCharacterOfString {

	public static void main(String[] args) {
		String s = "Raja";
		int len = s.length();
		if(len%2==0)
			System.out.println(s.substring(len/2-1,len/2+1));
		else
			System.out.println(s.substring(len/2,len/2+1));
		

	}

}
