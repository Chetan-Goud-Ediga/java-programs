package com.interview.questions;

public class Stringdecrement {

	public static void main(String[] args) {
		String s = "abcd";
		int x=0;
		while(x<s.length()) {
		String s1 = s.substring(x,s.length());
		String word ="";
		for(int i =0;i<s1.length();i++){
		word = word + s1.charAt(i);
		System.out.println(word);
		}
		x++;
		}
	
	}

}
