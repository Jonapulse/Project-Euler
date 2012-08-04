package problems;

import java.util.ArrayList;

public class Euler31 {
	
	public static void main(String args[]){
		ArrayList<Integer> coinTypes = new ArrayList<Integer>();
		coinTypes.add(new Integer("200"));
		coinTypes.add(new Integer("100"));
		coinTypes.add(new Integer("50"));
		coinTypes.add(new Integer("20"));
		coinTypes.add(new Integer("10"));
		coinTypes.add(new Integer("5"));
		coinTypes.add(new Integer("2"));
		coinTypes.add(new Integer("1"));	
		int needAmount = 200;
		int counter = canIHaveSomeChange(needAmount, coinTypes);
		System.out.println(counter);
	}
	
	/*
	 * Recursive, tries diminishing the needAmount by every type of coin,
	 * incrementing counter when the needAmount is diminished to 0.
	 */ 
	public static int canIHaveSomeChange(int amountLeft, ArrayList<Integer> coins){
		if(amountLeft == 0){
	//		System.out.println("WORKS!");
			return 1;
		}
		if(amountLeft < 0){
	//		System.out.println("BACK UP!");
			return 0;
		}
		int count = 0;
		count += canIHaveSomeChange(amountLeft - coins.get(0).intValue(), coins);
		ArrayList<Integer> newCoins = new ArrayList<Integer>(coins);
		for(int i = 0; i < coins.size() - 1; i++){
			for(int j = 0; j <= i; j++){
				newCoins.remove(0);
			}
			count += canIHaveSomeChange(amountLeft - newCoins.get(0).intValue(), newCoins);
			newCoins = new ArrayList<Integer>(coins);
		}
		return count;
	}
}
