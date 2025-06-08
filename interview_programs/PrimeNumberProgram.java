package com.interview.questions;

class PrimeNumberProgram {
	public static void main(String[] args) {
		int range = 20;
		int count = 0;
		System.out.print("Prime Numbers are : ");
		for (int i = 0; i <= range; i++) {
			boolean flag = true;

			if (i != 0) {
				if (i != 1) {

					for (int j = 2; j <= i / 2; j++) {
						if (i % j == 0)
							flag = false;

					}
					if (flag) {
						count++;
						System.out.print(i + " ");
					}

				}

			}

		}
		System.out.println("");
		System.out.println("Prime Number Count is " + count);
	}

}
