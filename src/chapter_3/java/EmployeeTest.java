package chapter_3.java;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee per1 = new Employee("John", "Lock", 4500.50);
		Employee per2 = new Employee("Tom", "Black", 3000.35);
		
		System.out.println("John's yearly salary is: " + per1.getYearlySalary());
		System.out.println("Tom's yearly salary is: " + per2.getYearlySalary());
		
		System.out.println("John's yearly salary after 10% raise is: " + (per1.getYearlySalary())*1.1);
		System.out.println("Tom's yearly salary after 10% raise is: " + (per2.getYearlySalary())*1.1);
		
		Employee per11 = new Employee("John", "Lock", -4500.50);
		Employee per22 = new Employee("Tom", "Black", -3000.35);
		
		System.out.println("John's yearly salary is: " + per11.getYearlySalary());
		System.out.println("Tom's yearly salary is: " + per22.getYearlySalary());
		
		per11.setMonthlysalary(per11.getMonthlySalary() * 1.1);
		
		System.out.println("John's yearly salary after 10% raise is: " + (per11.getYearlySalary()));
		System.out.println("Tom's yearly salary after 10% raise is: " + (per22.getYearlySalary())*1.1);
		
		Employee emp = new Employee();
		System.out.println("First name: " + emp.getFirstName());
		System.out.println("Last name " + emp.getLastName());
		System.out.println("Monthly salary " + emp.getMonthlySalary());

	}

}
