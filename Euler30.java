package problems;

import java.util.ArrayList;

public class Euler30 {
	public static void main(String args[]){
		ArrayList<Integer> fifthSums = new ArrayList<Integer>();
		for(int i = 2; i < 999999; i++){
			if(isFifthSum(i)) fifthSums.add(new Integer(i));
		}
		int total = 0;
		for(Integer num : fifthSums){
			System.out.println(num.toString());
			total += num.intValue();
		}
		System.out.println(total);
	}
	
	public static boolean isFifthSum(int num){
		String strI = String.valueOf(num);
		int fifthDigTotal = 0;
		for(int i = 0; i < strI.length(); i++){
			fifthDigTotal += Math.pow(strI.charAt(i) - '0',5);
		}
		if(fifthDigTotal == num) return true;
		else return false;
	}
}
