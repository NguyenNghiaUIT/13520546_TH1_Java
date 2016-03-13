package bai3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("Nhap vao so n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i <= n; i++){
			sum += Math.pow(i, i);
		}
		
		System.out.println("Ket qua: " + sum);
	}

}
