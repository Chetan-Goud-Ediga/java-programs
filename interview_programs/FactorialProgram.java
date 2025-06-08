package com.interview.questions;

public class FactorialProgram {
	
	
	public static void main(String[] args) {
		
		
		int fact =1,x=4,i=1;
				while(i<=x) {
					fact = fact*i;
					i++;
				}
				System.out.println("Factorial :"+fact);
				
			 fact=1;
					 int j=5;
				while(j>=1) {
					fact = fact*j;
					j--;
				}
				System.out.println("Factorial :"+fact);
				
				int range = 10;
				for (int k = 0; k <= range; k++) {
					 fact = 1;
					int l = 1;
					while (l <= k) {
						fact = fact * l;
						l++;
					}
					System.out.println("Factorial of " + k + "\tis " + fact);

				}

			}
		
	}
	
	
	


