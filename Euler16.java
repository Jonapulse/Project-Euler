package problems;

import java.math.BigInteger;
import java.lang.*;
import java.io.*;

public class Euler16 {
	public static void main(String args[]){
		String numForBig = "100";
		BigInteger bigNum = new BigInteger(numForBig);
		bigNum = bigFactorial(bigNum);
		int digitSum = sumDigitString(bigNum.toString());
		System.out.println(digitSum);
	}
	
	public static BigInteger bigFactorial(BigInteger num){
		String starter = "2";
		BigInteger factorial = new BigInteger(starter);
		for(int i = 3; i <= num.intValue(); i++){
			factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
		}
		return(factorial);
	}
	
	public static int sumDigitString(String numStr){
		int sum = 0;
		for(int i = 0; i < numStr.length(); i++){
			sum += numStr.charAt(i) - '0';
		}
		return(sum);
	}
}
