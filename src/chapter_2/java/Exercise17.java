package chapter_2.java;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.print("Enter first number:");
		num1 = input.nextInt();
		
		System.out.print("Enter second number:");
		num2 = input.nextInt();
		
		System.out.print("Enter third number:");
		num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("Sum is %d%n", sum);
		
		int average = sum / 3;
		System.out.printf("Average is %d%n", average);
		
		int product = num1 * num2 * num3;
		System.out.printf("Product is %d%n", product); 
		
		int min = num1;
		
		if (min > num2)
			min = num2;
		if (min > num3)
			min = num3;
		System.out.printf("The smallest is %d%n", min);
		
		int max = num1;
		
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		System.out.printf("The biggest is %d", max);
	}

}
