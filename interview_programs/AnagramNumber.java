package com.interview.questions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String one");
		String str1 = s.nextLine();
		System.out.println("Enter the String two");
		String str2 = s.nextLine();
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		isAnagram(str1, str2);
	}

	static void isAnagram(String str1, String str2) {
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] array1 = str1.toLowerCase().toCharArray();
			char[] array2 = str2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			status = Arrays.equals(array1, array2);
		}
		if (status)
			System.out.println(str1 + " and " + str2 + " are Anagrams ");
		else
			System.out.println(str1 + " and " + str2 + " are not Anagrams ");
	}
}
