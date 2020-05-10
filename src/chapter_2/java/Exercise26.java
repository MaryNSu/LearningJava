package chapter_2.java;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Enter first number:");
		num1 = input.nextInt();
		System.out.print("Enter second number:");
		num2 = input.nextInt();
		 
		if (num1 % num2 == 0)	
			System.out.print("The first number is multiple of the second ");
		else 
			System.out.print("The first number isn't multiple of the second");		
	}
}
