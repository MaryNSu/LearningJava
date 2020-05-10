package chapter_4.java;

import java.util.Scanner;

public class SquareOfAsterisks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the square length: "); // длина
		int length = scan.nextInt();
		int counter = length;
		int rows = length - 2; //ряд
		
		while(length > 0) {
			System.out.print("* ");
			length--;
		}
		
        length = counter;
        System.out.println();
        
        while(rows > 0) {
        	while(length > 0) {
	        	if(length == counter || length == 1)
	        		System.out.print("* ");
	        	else
	        		System.out.print("  ");
				length--;
			}
        	rows--;
        	length = counter;
            System.out.println();
        	
        }
	        
        length = counter;
 
        while(length > 0) {
			System.out.print("* ");
			length--;
		}
        
	}

}
