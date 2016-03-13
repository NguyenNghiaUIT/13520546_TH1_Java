package bai9;

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
		
		boolean isNguyenTo = true;
		for(int i = 2; i < Math.sqrt(n); i++){
			if(n % i == 0){
				isNguyenTo = false;
				break;
			}
		}
		
		if(isNguyenTo)
			System.out.println(n + " la so nguyen to");
		else
			System.out.println(n + " khong phai la so nguyen to");

	}

}
