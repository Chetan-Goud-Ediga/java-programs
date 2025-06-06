package assignment.array;

import java.util.Scanner;

public class CaseStudy1 {
	public static Scanner s = new Scanner(System.in);
	public static String[] brand = new String[5];
	public static double[] price = new double[5];
	public static int[] NumberOfItems = new int[5];

	public static void main(String[] args) {
		menuCreation();
		DisplayOfMenu(brand, price);
		System.out.println("Please order the each drink type and its quantity");
		DisplayOfResults(brand, NumberOfItems);
		s.close();

	}

	static void menuCreation() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Iteration: " + i);
			System.out.println("Enter drink Type");
			brand[i] = s.next();
			System.out.println("Price");
			price[i] = s.nextDouble();

		}
	}

	static void DisplayOfMenu(String[] brand, double[] price) {

		System.out.println("DrinkName\tPrice");
		for (int i = 0; i < 5; i++) {

			System.out.print(brand[i] + "\t" + price[i]);
			System.out.println(" ");
		}
	}

	static void DisplayOfResults(String[] brand, int[] NumberOfItems) {

		double Totalbill = 0;

		for (int i = 0; i < 5; i++) {
			double bill = 0;
			System.out.println(brand[i]);
			NumberOfItems[i] = s.nextInt();
			bill = price[i] * NumberOfItems[i];
			System.out.println(brand[i] + "\t : " + NumberOfItems[i] + " * " + price[i] + " = " + bill);
			Totalbill = Totalbill + bill;
		}
		System.out.println("TotalBill : " + Totalbill);

	}

}
