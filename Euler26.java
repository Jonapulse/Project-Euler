package problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Euler26 {
	private static final int CYCLE_LIMIT = 6000;
	
	public static void main(String args[]){
		for(int i = 1; i < 1000; i++){
			int cycLength = getCycleLength(1,i);
			if(cycLength > 221){
				System.out.println(i + " : " + cycLength);
			}	
		}
	}
	
	public static int getCycleLength(int num, int den){
		MathContext mc = new MathContext(CYCLE_LIMIT / 2);
		BigDecimal bigNum = new BigDecimal(num, mc);
		BigDecimal bigDen = new BigDecimal(den, mc);
		String cycleNumPure = bigNum.divide(bigDen,mc).toString();
		
		if(cycleNumPure.length() < CYCLE_LIMIT / 2) return 0;
		for(int i = 0; i < 6; i++){
			String cycle = "";
			cycle += cycleNumPure.charAt(i);
			String cycleNum = cycleNumPure.substring(i + 1);
			for(int j = 0; j < cycleNum.length(); j++){
				if(cycle.charAt(0) == cycleNum.charAt(j)){
					if(isCycle(cycle, cycleNum.substring(j))) return cycle.length();
				}
				cycle += cycleNum.charAt(j);
			}
		}
		return 0;
	}
	
	public static boolean isCycle(String cyc, String test){
		int cycIndex = 0;
		int precision = 0;
		for(int i = 0; i < test.length(); i++){
			if(cyc.charAt(cycIndex) != test.charAt(i)) return false;
			cycIndex++;
			if(cycIndex == cyc.length()){
				cycIndex = 0;
				precision++;
			}
		}
		if(precision < 10) return false;
		return true;
	}
}

