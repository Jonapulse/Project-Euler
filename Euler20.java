package problems;

import java.util.*;

public class Euler20 {
	//whoops, actually this is Euler21
	public static void main(String args[]){
		Map<Integer, Integer> numAndSum = new HashMap<Integer,Integer>();
		for(int i = 1; i < 10000; i++){
			numAndSum.put(new Integer(i),sumOfDivisors(i));
		}
		int amicableTotal = 0;
		for(Integer key : numAndSum.keySet()){
			if(numAndSum.get(key).equals(key)) continue;
			if(key.equals(numAndSum.get(numAndSum.get(key)))){
				amicableTotal += key.intValue();
			}
		}
		System.out.println(amicableTotal);
	}
	
	public static Integer sumOfDivisors(int num){
		ArrayList<Integer> divisorList = new ArrayList<Integer>();
		for(int i = 1; i < num; i++){
			if(num%i == 0) divisorList.add(new Integer(i));
		}
		int total = 0;
		for(Integer divisor: divisorList){
			total += divisor.intValue();
		}
		return new Integer(total);
	}
}
