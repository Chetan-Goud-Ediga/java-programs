package com.interview.questions;

public class FibonacciNumberProgram {

	public static void main(String[] args) {
		int f1 = 0, f2 = 1, f3;
		int i = 0, x = 10;
		System.out.print("Fibonacci Number : " + f1 + " " + f2);
		while (i <= x) {
			f3 = f1 + f2;
			System.out.print(" " + f3 + " ");
			f1 = f2;
			f2 = f3;
			i++;
		}
		
	}

}
