package bai8;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so n");
		n = in.nextInt();
		
		while(n < 0){
			System.out.println("Vui long nhap lai, n > 0");
			n = in.nextInt();
		}
		
		int value = n;
		int reverse = 0;
		while(value != 0){
			reverse = reverse * 10 + value % 10;
			value /= 10;
		}
		
		if(n == reverse){
			System.out.println("Doi xung");
		} else {
			System.out.println("Khong doi xung");
		}
	}
	
}
