package chapter_4.java;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = input.nextInt();
		
		double squareNum1 = Math.pow(num1, 2); 
		double squareNum2 = Math.pow(num2, 2); 
		double squareNum3 = Math.pow(num3, 2); 
		
		if(num1 > 0 && num2 > 0 && num3 > 0)	
			if(squareNum1 + squareNum2 == squareNum3 || 
					squareNum2 + squareNum3 == squareNum1 || 
					squareNum3 + squareNum1 == squareNum2)
				System.out.println("This is a right triangle");
			else
				System.out.println("This isn't right triangle");
		else
			System.out.println("The sides cannot be nagative");

	}

}
