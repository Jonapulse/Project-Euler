package problems;

import java.util.*;

public class Euler24 {
	
	public static void main(String args[]){
		ArrayList<String> allPermutations = new ArrayList<String>();
		String empty = "";
		String example = "0123456789";
		permuteNumsZeroTo(9, empty, allPermutations, example);
		Collections.sort(allPermutations);
		System.out.println(allPermutations.get(999999));
	}
	
	/*
	 * Rec: rocks the house and the cazbah.
	 */
	public static void permuteNumsZeroTo(int max, String str, ArrayList<String> allPerms, String exampString){
		if(str.length() == max + 1){
			allPerms.add(str);
			str = "";
			return;
		}
		for(int i = 0; i < exampString.length(); i++){
			String newStr = str + exampString.charAt(i);
			String newExamp = "";
			newExamp += exampString.substring(0, i) + exampString.substring(i+1);
			permuteNumsZeroTo(max, newStr, allPerms, newExamp);
			if(newStr.length() > max + 1) break;
		}
	}
}
