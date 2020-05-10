package chapter_4.java;

import java.util.Scanner;

public class SalesPerson{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		int valueCounter = 1;
		System.out.println("Enter the price of item " + valueCounter + " or -1 to quit: ");
		double value = input.nextDouble();
		
		while(value > 0) {
			total = total + value;
			System.out.println("Enter the price of item " + valueCounter + " or -1 to quit: "); 
			value = input.nextDouble();
			if(value > 0)
				valueCounter++;
		}
		System.out.println("Last week you sold " + valueCounter + " items");
		double totalWeekSalary = total * 0.09 + 200;
		System.out.printf("Total of all sales %.2f", totalWeekSalary);
	}
}

