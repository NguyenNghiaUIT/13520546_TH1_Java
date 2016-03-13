package bai6;

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
		
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				System.out.println("Uoc cua: " + n + " la: " + i);
			}
		}
	}
	
}
