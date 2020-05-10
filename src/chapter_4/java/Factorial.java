package chapter_4.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the number of terms: ");
		int number = input.nextInt() - 1;
//		long factorial = fact(number);
//		System.out.print("The factorial of this number is: " + factorial);
		
		double e = 1.0; 
		
		while(number > 0) {
			e = e + 1.0/(fact(number)); // можно записать как fact(number--)
			number--;
		}
		System.out.println("e is: " + e);
	}
	
	public static long fact(long number) {
		long product = 1;
		
		while(number > 1) {
			product *= number--;
		}
		return product;
	}

}
