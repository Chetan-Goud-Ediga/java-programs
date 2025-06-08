package com.interview;
public class ReverseOfWordsInSentance {
	public static void main(String[] args) {
	String original = "My name is xyz".toLowerCase();
	System.out.println("Original String:	"+original);
	System.out.println("Reverse String:		"+reverseOfString(original));
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
