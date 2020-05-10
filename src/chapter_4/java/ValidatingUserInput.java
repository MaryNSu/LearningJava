package chapter_4.java;

import java.util.Scanner;

public class ValidatingUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
			
		while (passes == 1 || failures == 2){ 
			System.out.print("Enter the number or 1 or 2 to quit: ");
			int result = input.nextInt();
			
			//это не сделано. сделать!!! 
				
			if (result == 1)
				passes = passes + 1;
			else
				failures = failures + 1; 
				
				//studentCounter = studentCounter + 1; 
		}
			System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
			
			if (passes > 8)
				 System.out.println("Bonus to instructor!");
		}
	}
			
			
			
			
	

