package bai15;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so dong ma tran: ");
		row = in.nextInt();
		
		System.out.println("Nhap so cot cua ma tran: ");
		column = in.nextInt();
	
		Random random = new Random();
		
		int[][] arr = new int[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				arr[i][j] = random.nextInt(256);
			}
		}
		
		//xuat matrix
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		//find min
		int min = arr[0][0];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				if(arr[i][j] < min){
					min = arr[i][j];
				}
			}
		}
		
		System.out.println("Gia tri nho nhat trong ma tran la: " + min);
	
		
		//find max
		int max = arr[0][0];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				if(arr[i][j] > max){
					max = arr[i][j];
				}
			}
		}
		System.out.println("Gia tri lon nhat trong ma tran la: " + max);
		
		
		//cac so nguyen to trong ma tran
		System.out.println("Cac so nguyen to trong ma tran: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				if(isNguyenTo(arr[i][j]))
					System.out.println(arr[i][j]);
			}
		}
		
		//tong cac so trong ma tran
		int sum = 0;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				sum += arr[i][j];
			}
		}
		System.out.println("Tong cac gia tri trong ma tran la: " + sum);
		
		
		
		
	}
	
	public static boolean isNguyenTo(int n){
		boolean isNguyenTo = true;
		for(int i = 2; i < Math.sqrt(n); i++){
			if(n % i == 0){
				isNguyenTo = false;
				break;
			}
		}
		return isNguyenTo;
	}

}
