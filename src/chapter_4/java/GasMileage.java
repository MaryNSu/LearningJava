package chapter_4.java;
import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		double average;
		int counter = 0;
		
		System.out.println("Enter miles driven: ");
		int milesDriven = input.nextInt();
		System.out.println("Enter gallons used: ");
		int gallonsUsed = input.nextInt();
		
		while(milesDriven != -1 && gallonsUsed != -1){
			counter++;
			average = milesDriven / gallonsUsed;
			System.out.println("The average miles per gallon is " + average + " in trip nr:" + counter);
			total = total + average;
		
			System.out.println("Enter miles driven: ");
			milesDriven = input.nextInt();
			System.out.println("Enter gallons used: ");
			gallonsUsed = input.nextInt();
		}
		
		total = total / counter;
		if (counter > 0)
			System.out.println("The total average the miles per gallon is " + total);
		else
			System.out.println("No data entered");
	}

}
