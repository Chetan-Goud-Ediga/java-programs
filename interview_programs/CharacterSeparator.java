package com.interview.questions;

public class CharacterSeparator {
    public static void main(String[] args) {
        String input = "Hello@123#World!";  // Sample input

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            } else {
                specialChars += ch;
            }
        }

        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}
