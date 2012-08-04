package problems;

import java.math.BigInteger;

public class Euler25 {
	public static void main(String args[]){
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("1");
		BigInteger placeHolder = new BigInteger("0");
		int count = 2;
		while(n2.toString().length() < 1000){
			placeHolder = n1;
			n1 = n2;
			n2 = placeHolder.add(n2);
			count++;
			System.out.println(n2.toString().length());
		}
		System.out.println(count);
	}
}
