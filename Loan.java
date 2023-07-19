package javaintroduction;

import java.util.Scanner;

// Read user age as input. If age is more than 20, then read salary as input. If
// salary is greater than 25000, print as loan sanctioned. Else Rejected

public class Loan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		if (age > 20)
			System.out.println("Enter the salary: ");
		else
			System.out.println("age should be more than 20 years");
		int salary = sc.nextInt();
		if (salary > 25000)
			System.out.println("loan sanctioned");
		else
			System.out.println("loan rejected");

		sc.close();

	}

}
