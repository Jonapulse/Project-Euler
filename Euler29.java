package problems;

import java.math.*;
import java.util.ArrayList;

// oh come on, this took me 6 minutes.  So dang easy.
public class Euler29 {
	public static void main(String args[]){
		ArrayList<BigInteger> allNums = new ArrayList<BigInteger>();
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				BigInteger bigA = new BigInteger(String.valueOf(a));
				BigInteger ans = bigA.pow(b);
				if(!allNums.contains(ans)) allNums.add(ans);
			}
		}
		System.out.println(allNums.size());
	}
}
