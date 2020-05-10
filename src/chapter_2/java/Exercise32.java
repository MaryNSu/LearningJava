package chapter_2.java;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		int i;
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroesCount = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		i = input.nextInt();
		
		if(i > 0)
			positiveCount++;
		else if(i < 0)
			negativeCount++;
		else 
			zeroesCount++;
		
		System.out.println("Enter a number: ");
		i = input.nextInt();
		
		if(i > 0)
			positiveCount++;
		else if(i < 0)
			negativeCount++;
		else 
			zeroesCount++;

		System.out.println("Enter a number: ");
		i = input.nextInt();
		
		if(i > 0)
			positiveCount++;
		else if(i < 0)
			negativeCount++;
		else 
			zeroesCount++;

		System.out.println("Enter a number: ");
		i = input.nextInt();
		
		if(i > 0)
			positiveCount++;
		else if(i < 0)
			negativeCount++;
		else 
			zeroesCount++;

		System.out.println("Enter a number: ");
		i = input.nextInt();
		
		if(i > 0)
			positiveCount++;
		else if(i < 0)
			negativeCount++;
		else 
			zeroesCount++;
		
		System.out.println("You entered: " + positiveCount + " positive numbers");
		System.out.println("You entered: " + negativeCount + " negative numbers");
		System.out.println("You entered: " + zeroesCount + " zeroes");
	}

}
