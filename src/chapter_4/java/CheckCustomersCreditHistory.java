package chapter_4.java;

import java.util.Scanner;

public class CheckCustomersCreditHistory {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of customers");
		int numberOfCustomers = input.nextInt();
		
		while(numberOfCustomers > 0) {
			Customer customer = new Customer();
			System.out.println("Enter the initial balance for customer");
			customer.setInitialBalance(input.nextInt());
			System.out.println("Enter the number of charged items");
			customer.setTotalItems(input.nextInt());
			System.out.println("Enter the number of all credits");
			customer.setTotalCredits(input.nextInt());
			System.out.println("Enter the credit limit");
			customer.setAllowedCredit(input.nextInt());
			
			System.out.println("The new balance is " + customer.getNewBalance());
			if(customer.isBalanceExceedingCredit()) 
				System.out.println("Credit limit exceeded");
			
			numberOfCustomers--;
		}

	}

}
