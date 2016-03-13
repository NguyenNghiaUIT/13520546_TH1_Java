package bai2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao ban kinh hinh tron: ");
		int radius = in.nextInt();
		float c =(float) ((Math.PI * 2) * radius);
		System.out.println("Chu vi hinh tron: " +  c);

	}

}
