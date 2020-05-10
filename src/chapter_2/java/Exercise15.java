package chapter_2.java;

import java.util.Scanner;

public class Exercise15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2; 
		System.out.printf("Sum is %d%n", sum);
		
		int product = num1 * num2;
		System.out.printf("Product is %d%n", product);
		
		int difference = num1 - num2;
		System.out.printf("Difference is %d%n", difference);
		
		double division = (double)num1 / num2; // %f is for float
		// %d is for int
		// we can leave int as a result
		// but it will divide only without the remaing part
		// so if int -> 11/5=2
		System.out.printf("Division is %.2f%n", division);
		input.close();
	}
}
