package com.interview.questions;
public class CharacterSeparator {
    public static void main(String[] args) {
        String input = "Hello@123#World!";  // Sample input
        //alphaNumericCountForLoop(input);
        alphaNumericCountForEachLoop(input);
    }
static void alphaNumericCountForLoop(String input){
        String letters = "";
        String digits = "";
        String specialChars = "";
        int letterCount = 0, digitCount = 0, specialCharacterCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters += ch;
                letterCount += 1;
            } else if (Character.isDigit(ch)) {
                digits += ch;
                digitCount += 1;
            } else {
                specialChars += ch;
                specialCharacterCount += 1;
            }
        }

        System.out.println("Alphabets:          " + letters+",  Count:	"+letterCount);
        System.out.println("Digits:             " + digits+",   Count:	"+digitCount);
        System.out.println("Special Characters: " + specialChars+", Count:	"+specialCharacterCount);
}

static void alphaNumericCountForEachLoop(String input){
        String letters = "";
        String digits = "";
        String specialChars = "";
        int letterCount = 0, digitCount = 0, specialCharacterCount = 0;
        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                    letters += ch;
                    letterCount += 1;}
            else if(Character.isDigit(ch)){
                    digits += ch;
                    digitCount += 1;}
            else {
                    specialChars +=ch;
                    specialCharacterCount += 1;}
        }
        System.out.println("Alphabets:	            " + letters+",       Count:  "+letterCount);
        System.out.println("Digits:                 " + digits+",        Count:  "+digitCount);
        System.out.println("Special Characters:     " + specialChars+",     Count:  "+specialCharacterCount);
    }
}
