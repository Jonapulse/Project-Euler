package problems;

public class Euler1 {
	public static final int NUM_LIMIT = 1000;
	public static final int N1 = 3;
	public static final int N2 = 5;
	
	public static void main(String args[]){
		int total = 0;
		for(int i = 1; i < NUM_LIMIT; i++){
			if(i % N1 == 0 || i % N2 == 0) total += i;
		}
		System.out.println(total);
	}
}
