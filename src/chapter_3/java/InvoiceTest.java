package chapter_3.java;

//import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Invoice invoice = new Invoice("Order", "Mama-mia", 25, 35.5);
		
		System.out.println("Invoice number: " + invoice.getNumber());
		System.out.println("Invoice description: " + invoice.getDescription());
		System.out.println("Invoice quantity: " + invoice.getQuantity());
		System.out.println("Invoice price: " + invoice.getPrice());
		System.out.println("Invoice amount is: " + invoice.getInvoiceAmount());
		
		invoice.setQuantity(-10);
		System.out.println("Updated Invoice quantity: " + invoice.getQuantity());
		System.out.println("Updated Invoice amount is: " + invoice.getInvoiceAmount());
		
		Invoice invoice2 = new Invoice("Order", "Mama-mia", -25, -35.5);
		
		System.out.println("Invoice number: " + invoice2.getNumber());
		System.out.println("Invoice description: " + invoice2.getDescription());
		System.out.println("Invoice quantity: " + invoice2.getQuantity());
		System.out.println("Invoice price: " + invoice2.getPrice());
		System.out.println("Invoice amount is: " + invoice2.getInvoiceAmount());
		
		invoice2.setPrice(-25.5);
		System.out.println("Updated Invoice price: " + invoice2.getPrice());
		System.out.println("Updated Invoice amount is: " + invoice2.getInvoiceAmount());

	}

}
