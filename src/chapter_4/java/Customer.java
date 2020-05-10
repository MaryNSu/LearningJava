package chapter_4.java;
import java.util.Scanner;

public class Customer {
	private int accountNumber;
	private int initialBalance;
	private int totalItems;
	private int totalCredits;
	private int allowedCredit;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int balance) {
		this.initialBalance = balance;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public int getTotalCredits() {
		return totalCredits;
	}
	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}
	public int getAllowedCredit() {
		return allowedCredit;
	}
	public void setAllowedCredit(int allowedCredit) {
		this.allowedCredit = allowedCredit;
	}
	public int getNewBalance() {
		return getInitialBalance() + getTotalItems() - getTotalCredits();
	}
	
	public boolean isBalanceExceedingCredit() {
		if (getNewBalance() > getAllowedCredit()) 
			return true;
		else 
			return false;
	}
}

