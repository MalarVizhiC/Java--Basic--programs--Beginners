package javaintroduction;

public class SwapNumbers {
	public static void main(String args[]) {
		int a = 5;
		int b = 7;
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		System.out.println("Before swapping the a and b is " + a + " and  " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping the a and b is " + a + " and " + b);

	}

}
