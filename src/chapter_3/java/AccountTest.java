package chapter_3.java;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// create an Account object and assign it to myAccount
		Account myAccount = new Account("John", 2000);
		
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		System.out.printf("Your current balance is: %.2f%n", myAccount.getBalance());
		
		System.out.println("Please enter the deposit:");
		Double deposit = input.nextDouble();
		myAccount.deposit(deposit);
		
		System.out.printf("Your current balance is: %.2f%n", myAccount.getBalance());
		
		System.out.println("Please enter the deposit:");
		Double withdraw = input.nextDouble();
		myAccount.withdraw(withdraw);
		
		System.out.printf("Your current balance is: %.2f", myAccount.getBalance());
		
	}
}
