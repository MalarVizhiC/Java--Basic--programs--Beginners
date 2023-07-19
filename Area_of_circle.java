package javaintroduction;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		int r;
		double pi = 3.14, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		r = sc.nextInt();
		area = pi * r * r;
		System.out.println("The area of circle is " + area);
		sc.close();
	}

}
