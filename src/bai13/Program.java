package bai13;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao so n: ");
		n = in.nextInt();
		
		System.out.println("Nhap vao so m: ");
		m = in.nextInt();
		Random random = new Random();
		
		int[] A = new int[n];
		int[] B = new int[m];
		
		for(int i = 0; i < n; i++){
			A[i] = random.nextInt(2323);
		}
		
		for(int i = 0; i < m; i++){
			B[i] = random.nextInt(100);
		}
		
		//b
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		
		//c
		int[] C = Arrays.copyOf(A, n);
		System.out.println(Arrays.toString(C));
		
		
		//e
		Arrays.sort(C);
		System.out.println(Arrays.toString(C));
		
		int x = 0;
		System.out.println("Nhap gia tri cho x: ");
		x = in.nextInt();
		
		System.out.println(Arrays.binarySearch(C, x));
		
	}

}
