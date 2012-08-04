package problems;

import java.util.ArrayList;

public class Euler23 {
	public static void main(String args[]){
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		for(int i = 1; i <= 28123; i++){
			if(isAbundantNum(new Integer(i))){
				abundantNums.add(new Integer(i));
			}
		}
		
	//	for(Integer test : abundantNums){
//			System.out.println(test.intValue());
	//	}
		
		
		ArrayList<Integer> notAbundSumNums = new ArrayList<Integer>();
		for(int i = 1; i <= 28123; i++){
			if(isNotAbundSumNums(new Integer(i), abundantNums)){
				notAbundSumNums.add(new Integer(i));
			}
		}
		int sumOfNotAbundSumNums = 0;
		for(int i = 0; i < notAbundSumNums.size(); i++){
			sumOfNotAbundSumNums += notAbundSumNums.get(i).intValue();
		}
		System.out.println(sumOfNotAbundSumNums);
	}
	
	public static boolean isAbundantNum(Integer num){
		ArrayList<Integer> divisors = getDivisors(num.intValue());
		int divTotal = 0;
		for(Integer div : divisors){
			divTotal += div.intValue();
		}
		if(divTotal > num.intValue()) return true;
		return false;
	}
	
	public static ArrayList<Integer> getDivisors(int num){
		ArrayList<Integer> divisorList = new ArrayList<Integer>();
		for(int i = 1; i < num; i++){
			if(num%i == 0) divisorList.add(new Integer(i));
		}
		return divisorList;
	}
	
	public static boolean isNotAbundSumNums(Integer num, ArrayList<Integer> abundNums){
		for(int i = 0; i < abundNums.size(); i++){
			for(int j = i; j < abundNums.size(); j++){
				if(abundNums.get(i).intValue() + abundNums.get(j).intValue() == num.intValue()){
					return false;
				}
			}
		}
		return true;
	}
}
