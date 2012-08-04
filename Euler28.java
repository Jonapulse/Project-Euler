package problems;

public class Euler28 {
	public static void main(String args[]){
		int diagonalTotal = 0;
		int i = 1;
		int gap = 2;
		diagonalTotal += 1;
		while(i < 1002001){
			for(int j = 0; j < 4; j++){
				i += gap;
				diagonalTotal +=i;
				System.out.println(i);
			}
			gap += 2;
		}
		System.out.println(diagonalTotal);
	}

}
