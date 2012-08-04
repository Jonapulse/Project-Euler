package problems;

import java.util.HashMap;
import java.util.Map;
import java.lang.*;

public class Euler14 {
	
	public static void main(String args[]){
		Map<Long , Long> lengthList = new HashMap<Long, Long>();
		for(int i = 1; i < 1000000; i++){
			long len = hailstoneLength(i, lengthList);
			lengthList.put(new Long(i), new Long(len));
		}
		long max = 0;
		Long maxLong = new Long(0);
		for(Long n: lengthList.keySet()){
			int len = lengthList.get(n).intValue();
			if(len > max){
				max = len;
				maxLong = n;
			}
		}
		System.out.println("This is the max length: " + max + 
				" from " + maxLong.intValue());
	}
	
	public static long hailstoneLength(int start, Map<Long, Long> lengthList){
		long length = 0;
		long n = start;
		while(n != 1){
			length++;
			if(n % 2 == 0) n /= 2;
			else n = 3*n + 1;
			if(lengthList.containsKey(new Long(n))){
				length = length + lengthList.get(new Long(n)).longValue();
				lengthList.put(new Long(start), new Long(length));
				break;
			}
		}
		return(length);
	}
}


