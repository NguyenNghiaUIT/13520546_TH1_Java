package bai12;

import java.math.BigInteger;

public class Program {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("1234567890",10);
		BigInteger b = new BigInteger("9876654321", 10);
		BigInteger c = new BigInteger("3", 10);
		b = b.multiply(c);
		a = a.add(b);
	
		System.out.println(a);

	}

}
