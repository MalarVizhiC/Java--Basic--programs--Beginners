package javaintroduction;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		float p, n, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		p = sc.nextFloat();
		System.out.println("Enter the number of years");
		n = sc.nextFloat();
		System.out.println("Enter the rate of interest");
		r = sc.nextFloat();
		float SI = p * n * r / 100;
		System.out.println("The simple interest is " + SI);
		sc.close();
	}

}
