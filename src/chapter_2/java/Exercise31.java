package chapter_2.java;

public class Exercise31 {

	public static void main(String[] args) {
		System.out.println("number\tsquare\tcube");
		int i = 0;
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));// => getCube(i); i = i + 1;
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
		System.out.println(i + "\t" + getSquare(i) + "\t" + getCube(i++));
	}
	
	public static int getSquare(int number) {
		return number * number;
	}
	
	public static int getCube(int number) {
		return number * number * number;
	}
	
	

}
