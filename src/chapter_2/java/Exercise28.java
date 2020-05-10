package chapter_2.java;

import static java.lang.Math.*;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = input.nextInt();
		
		System.out.printf("Diameter: %d%n", 2*radius);
		System.out.printf("Circumference: %.2f%n", 2*Math.PI*radius);
		System.out.printf("Area: %.2f%n", Math.PI*radius*radius);


	}

}
