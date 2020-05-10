package chapter_4.java;

import java.util.Scanner;

public class GrossPay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double workedHours;
		double grossPay;
		double hourlyRate;
		int counter = 1;
		double rate = 0;
		
		while(counter <= 3){
		System.out.println("Enter the " + counter + " employee's name: ");
		String name = input.next();
		System.out.println("Enter number of hours worked last week: ");
		workedHours = input.nextInt();
		System.out.println("Enter the hourly rate: ");
		hourlyRate = input.nextDouble();
		
		
		System.out.println("The gross pay for "+ name + " is " + calculateWeeklySalary(workedHours, hourlyRate)); 
		counter++;
			}
		}
	
	public static double calculateWeeklySalary(double workedHours, double hourlyRate) {
		double rate;
		if(workedHours > 40) 
			rate = 1.5;
		else
			rate = 1;
		
		double grossPay = workedHours * hourlyRate * rate;
		
		return grossPay;
	}
}

