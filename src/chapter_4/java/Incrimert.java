package chapter_4.java;

public class Incrimert {

	public static void main(String[] args) {
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); // prints 5
		System.out.printf(" postincrementing c: %d%n", c++); // prints 5
		System.out.printf(" c after postincrement: %d%n", c); // prints 6 
		
		System.out.println(); // skip a line
		
		// demonstrate prefix increment operator
		c = 5; 
		System.out.printf(" c before preincrement: %d%n", c); // prints 5
		System.out.printf(" preincrementing c: %d%n", ++c); // prints 6
		System.out.printf(" c after preincrement: %d%n", c); // prints 6 
		
	}
}
