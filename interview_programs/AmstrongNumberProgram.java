package com.interview.questions;

public class AmstrongNumberProgram {

	public static void main(String[] args) {
		int Orgnum = 407,rem,amstnum=0;
		System.out.println(Orgnum);
		int num = Orgnum;
		while(num>0) {
			
			rem = num%10;
			amstnum = amstnum +rem*rem*rem;
			num=num/10;
		}
		
		System.out.println(amstnum);
System.out.println(amstnum == Orgnum);
	}

}
