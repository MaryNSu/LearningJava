package chapter_4.java;

import java.util.Scanner;

public class TwoLargest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largest = -1000000;
		int secLargest = -1000000;
		int counter = 1;
			
		while(counter <= 10){
			System.out.println("Enter the number: ");
			int number = input.nextInt();
			counter++;				
			if(number > largest) {
				largest = number;
			} 
			else if(number > secLargest) {
				secLargest = number;
			}
			
		}
		System.out.printf("The largest number is %d%n", largest);
		System.out.printf("The second largest number is %d%n", secLargest);
	}
}

