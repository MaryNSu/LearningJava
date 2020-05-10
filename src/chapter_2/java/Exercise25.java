package chapter_2.java;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num;
		
		System.out.print("Enter a number:");
		num = input.nextInt();
		
		if (num % 2 == 0)
			System.out.print("This number is even");
		else 
			System.out.print("This number is odd");
	}

}
