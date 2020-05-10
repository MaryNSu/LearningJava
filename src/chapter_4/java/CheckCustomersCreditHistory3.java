package chapter_4.java;

import java.util.Scanner;

public class CheckCustomersCreditHistory3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean newCustomer = true;
		
		while(newCustomer) {
			System.out.println("Do you want to enter a new customer. Enter \"yes\" or \"no\"");
			String enterANewCustomer = input.next();
			newCustomer = enterANewCustomer.equalsIgnoreCase("yes") ? true: false;
			if(!newCustomer)
				return;
			
			System.out.println("Enter the initial balance for customer");
			int initialBalance = input.nextInt();
			System.out.println("Enter the number of charged items");
			int totalItems = input.nextInt();
			System.out.println("Enter the number of all credits");
			int totalCredits = input.nextInt();
			System.out.println("Enter the credit limit");
			int allowedCredit = input.nextInt();
			
			int newBalance = initialBalance + totalItems - totalCredits;
			System.out.println("The new balance is " + newBalance);
			if(newBalance > allowedCredit) 
				System.out.println("Credit limit exceeded");
		}

	}

}
