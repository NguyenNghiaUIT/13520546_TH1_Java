package bai7;

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
		
		
		int lenght = 0;
		while(n != 0){
			lenght++;
			n /= 10;
		}
		
		System.out.println("So n co  " + lenght + " chu so.");
	}
	
}
