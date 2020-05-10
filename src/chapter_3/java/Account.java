package chapter_3.java;

public class Account{
	private String name; // instance variable, field
	private double balance;
	
	Account(String name, double balance){
		this.name = name;
		if (balance > 0.0) // if the balance is valid
			 this.balance = balance;
	}
	
	public void deposit(double depositAmount){
		if (depositAmount > 0.0) 
			balance = balance + depositAmount; 
	}
	
	public double getBalance(){
		return balance;
	}
	
	
	//method to set the name in the object
	public void setName(String name){
		this.name = name; // store the name
	}
	
	public String getName(){
		return name;
	}
	
	public void withdraw(double withdrawAmount){
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.println("Withdrawal amount exceeded account balance.");
		
	}
}
