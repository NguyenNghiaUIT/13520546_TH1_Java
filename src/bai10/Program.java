package bai10;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String x = "";
		String y = "";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap chuoi x: ");
		x = in.nextLine();
		System.out.println("Nhap chuoi y: ");
		y = in.nextLine();
		
		//a
		System.out.println("Lenght of String x: " + x.length());
		System.out.println("Lenght of String y: " + y.length());
		
		//b
		System.out.println("Ba ki tu dau tien cua chuoi x: " + x.substring(0, 3));
		
		//c
		System.out.println("Ba ki tu cuoi cua chuoi y: " + y.substring(y.length() - 3,  y.length()));
		
		//d
		System.out.println("Ki tu thu 6 cua chuoi x:" + x.charAt(6));
		
		//e
		String str = x.substring(0, 3) + y.substring(y.length() - 3,  y.length());
		System.out.println(str);
		
		//f
		if(x.equals(y) == true)
			System.out.println("Hai chuoi bang nhau phan biet chu hoa, chu thuong");
		else
			System.out.println("Hai chuoi khong bang nhau phan biet chu hoa, chu thuong");
		
		//g
		if(x.equalsIgnoreCase(y) == true)
			System.out.println("Hai chuoi bang nhau phan khong biet chu hoa, chu thuong");
		else
			System.out.println("Hai chuoi khong bang nhau khong phan biet chu hoa, chu thuong");
		
		
		//h
		if(x.indexOf(y) == -1)
			System.out.println("Khong tim thay chuoi y trong chuoi x");
		else
			System.out.println("Tim thay chuoi y trong chuoi x tai vi tri: " + x.indexOf(y));
		
		
		//i
		int pos = 0;
		while((pos = x.indexOf(y,  pos)) != -1 ){
			System.out.println("Postion: " + pos);
		}
	}
}
