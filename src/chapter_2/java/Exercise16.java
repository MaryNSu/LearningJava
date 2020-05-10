package chapter_2.java;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Enter first number:");
        num1 = input.nextInt();
    
        System.out.print("Enter second number:");
        num2 = input.nextInt();

        if (num1 == num2) {
        	System.out.println("The numbers are equal");
        }
   
        if (num1 > num2) {
        	System.out.printf("%d is larger", num1);
        }
        if (num1 < num2) {
        	System.out.printf("%d is larger", num2);
        }
        
        input.close();
	}
}
