package chapter_4.java;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = input.nextInt();
		
		if(num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2
			&& num1 > 0 && num2 > 0 && num3 > 0 )
			System.out.println("This Triangle exists");
		else
			System.out.println("This Triangle doesn't exist");
		

	}

}
