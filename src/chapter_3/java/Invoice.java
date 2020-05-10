package chapter_3.java;

public class Invoice{
	private String number; 
	private String description;
	private int quantity;
	private double price;
	
	Invoice(String number, String description, int quantity, double price){
		this.number = number;
	    this.description = description;
	    setQuantity(quantity);
	    setPrice(price);	
	}
	
	//method to set the number in the object
	public void setNumber(String number){
		this.number = number; // store the number
	}
	
	public String getNumber(){
		return number;
	}
	
	//method to set the description in the object
	public void setDescription(String description){
		this.description = description; // store the description
	}
	
	public String getDescription(){
		return description;
	}

	//method to set the quantity in the object
	public void setQuantity(int quantity){
		if (quantity > 0)
	    	this.quantity = quantity;
	    else
	    	this.quantity = 0;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	//method to set the price in the object
	public void setPrice(double price){
		if (price > 0)
			this.price = price;
		else
		    this.price = 0.0;
	}
	
	public double getPrice() {
		return price;
	}

	public double getInvoiceAmount(){
		double invoiceAmount = quantity * price;
		return invoiceAmount;
	}
}



