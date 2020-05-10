package chapter_3.java;

public class Employee {
	private String firstName; 
	private String lastName;
	private double monthlySalary;

	Employee() {}

	Employee(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		setMonthlysalary(monthlySalary);
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setMonthlysalary(double monthlySalary){
		if(monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}
	
	public double getMonthlySalary(){
		return monthlySalary;
	}
	
	public double getYearlySalary() {
		return this.getMonthlySalary() * 12;
		
	}
	
}
