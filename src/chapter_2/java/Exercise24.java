package chapter_2.java;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		System.out.print("Enter first number:");
		num1 = input.nextInt();
		
		System.out.print("Enter second number:");
		num2 = input.nextInt();
		
		System.out.print("Enter third number:");
		num3 = input.nextInt();
		
		System.out.print("Enter fourth number:");
		num4 = input.nextInt();
		
		System.out.print("Enter fifth number:");
		num5 = input.nextInt();
		
        int min = num1;
      
		if (min > num2)
			min = num2;
		if (min > num3)
			min = num3;
		if (min > num4)
			min = num4;
		if (min > num5)
			min = num5;
		
		System.out.printf("The smallest is %d%n", min);
		
		int max = num1;
		
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		if (max < num4)
			max = num4;
		if (max < num5)
			max = num5;
		System.out.printf("The biggest is %d", max);
	}

}
