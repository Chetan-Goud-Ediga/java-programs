package com.interview;

public class ReverseOfWordsInSentance {

	public static void main(String[] args) {
	String original = "My name is xyz";
	System.out.println("Original String:	"+original);
	String revrese = reverseOfString(original);
	System.out.println("Reverse String:		"+revrese);
	}
	static String reverseOfString(String input) {
		String revrese = " ";
		String[] words = input.split("\\s");
		for(String word : words) {
			revrese = revrese + new StringBuilder(word).reverse().append(" ").toString();
		}
		
		return revrese.trim();
	}
	

}
