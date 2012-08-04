package problems;

import java.util.ArrayList;
import java.awt.Point;
//import EulerProblems.*;

public class Euler32 {
	public static void main(String args[]){
		int panTotal = 0;
		ArrayList<Integer> panList = new ArrayList<Integer>();
		for(int i = 1000; i < 10000; i++){
			panList.addAll(getPanNumbers(i));
		}
		for(Integer num : panList){
			panTotal += num.intValue();
		}
	}
	
	public static ArrayList<Integer> getPanNumbers(int i){
		ArrayList<Integer> pansForNum = new ArrayList<Integer>();
		if(isNinePanNumber(String.valueOf(i))){
			if(isNinePanNumber(numWithCompatibleDivisors(i))) pansForNum.add(new Integer(String.valueOf(i)));
		}
		return pansForNum;
	}
	
	public static boolean isNinePanNumber(String num){
		int digitCount = 0;
		for(int i = 1; i <= 9; i++){
			for(int j = 0; j < num.length(); j++){
				if(num.charAt(j) - '0' == i) digitCount++;
			}
			if(digitCount > 1) return false;
		}
		return true;
	}
	
	/*whoops.  K I'm guessing each number has at most one of these.  
	If I get an error than this is one reason why probably.  Damn, that's wrong.II"LL FINISH THIS LAATTERERR!
	*/
	public static String numWithCompatibileDivisors(int num){
		//this is a hack, but I'm storing my divisorcouples as GPoints
		ArrayList<Point> divisorCouples = getDivisorCouples(num);
		for(Point p : divisorCouples){
			String divisors = "";
			divisors += p.getX() + p.getY();
		}
	}
	
	public static ArrayList<Point> getDivisorCouples(int num){
		ArrayList<Point> divisorCouples = new ArrayList<Point>();
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				Point divCoup = new Point(i, num/i);
				divisorCouples.add(divCoup);
			}
		}
		return divisorCouples;
	}

}
