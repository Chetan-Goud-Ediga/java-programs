package com.interview.questions;

public class VowelsInString {

	public static void main(String[] args) {
		String s = new String("HI Hello Hey");
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;
		}

		System.out.println("Count of Vowel :" + count);
	}

}
