package assignment.array;

import java.util.Scanner;

public class Statement1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] empId = new int[5];
		String[] empName = new String[5];
		double[] salary = new double[5];
		System.out.println("Enter the Employee Id, Name and Salary");
		for (int i = 0; i < 5; i++) {
			System.out.println("Iteration: " + i);
			empId[i] = s.nextInt();
			empName[i] = s.next();
			salary[i] = s.nextDouble();

		}
		s.close();
		DisplayOfResult(empId, empName, salary);
	}

	static void DisplayOfResult(int[] empId, String[] empName, double[] salary) {

		System.out.print("ID");
		System.out.print("\tName\t");
		System.out.print("Salary");
		System.out.println(" ");

		for (int i = 0; i < 5; i++) {

			System.out.format("%03d",empId[i]);
			System.out.print("\t" + empName[i] + "\t");
			System.out.print(salary[i]);
			System.out.println(" ");
		}

	}

}
