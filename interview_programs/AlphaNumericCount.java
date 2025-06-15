package com.interview.questions;
public class AlphaNumericCount {
	public static void main(String[] args) {
		String s = "as1e2f3d45Z";
		int numCount = 0;
		int alphaCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z')
				alphaCount++;
			else
				numCount++;
		}
		System.out.println("Alphabet Count: " + alphaCount + " Number Count: " + numCount);
	}
}
