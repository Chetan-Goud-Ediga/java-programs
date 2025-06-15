package com.interview.questions;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        int number = 407, amstrongNumber = 0;
        int n = number;
        // int rem = 0;
        while(n > 0){
            // rem = n%10;
            // amstrongNumber = amstrongNumber + rem*rem*rem;
            amstrongNumber = amstrongNumber + (int)Math.pow(n%10,3);
            n = n / 10;
        }
        System.out.println(amstrongNumber);
        if(number == amstrongNumber)
             System.out.println("Given number is Amstrong");
    }
}
