package bai4;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = in.nextInt();
		System.out.println("Nhap so b: ");
		b = in.nextInt();
		
		System.out.printf("Ket qua lay 3 so le: %.3f", (float)a/b);
	}
	
}
