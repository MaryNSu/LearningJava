package chapter_3.java;

public class Date {
	private int month;
	private int day;
	private int year;
	
	Date(int month, int day, int year){
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public void setMonth(int month){
		if(month > 0 && month < 13)
			this.month = month; // store the month
	}
	
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		if(day > 0 && day < 32)
			this.day = day; // store the day
	}
	
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		if(year > -9999 && year < 9999)
			this.year = year; // store the year
	}
	
	public int getYear(){
		return year;
	}
	
	public void displayDate(){
		System.out.println(month + "/" + day + "/" + year);
	}
	
}
	
