package bai11;

import java.util.Calendar;

public class Program {
	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();
		Calendar b = Calendar.getInstance();
		
		//a
		if(a.equals(b) == true){
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}
		
		//b
		System.out.println("Next day of a is: " + (a.get(Calendar.DAY_OF_MONTH) + 1));
		
		
		//c
		System.out.println("Previous day of a is: " + (a.get(Calendar.DAY_OF_MONTH) - 1) );
		
		//d
		System.out.println("Day of year: " + a.get(Calendar.DAY_OF_YEAR));
		
		//e
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH);
		a.set(year, month, 1);
		int totalDay = a.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(totalDay);
		
		//f
		System.out.println(a.isLenient());
		
	}
}
