package problems;

public class Euler27 {
	public static void main(String args[]){
		int maxLength = 0;
		int maxA = 0;
		int maxB = 0;
		for(int a = -999; a < 1000; a++){
			for(int b = -999; b < 1000; b++){
				int n = 0;
				while(true){
					if(isPrime(Math.abs(n*n + a*n + b))){
						n++;
					} else {
						if( n > maxLength){
							maxLength = n;
							maxA = a;
							maxB = b;
						}
						break;
					}
				}
			}
		}
		System.out.println("a: " + maxA + ", b: " + maxB + " with " + maxLength + " primes, and their product is " + maxA * maxB);
	}

	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0) return false;
		}
		return true;
	}
}
