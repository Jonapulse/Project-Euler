package problems;

public class Euler19 {
	public static void main(String args[]){
		System.out.println(numSundays());
		
	}
	
	public static int numSundays(){
		//the start
		int sundayCount = 0;
		int dayOfWeek = 2; //It was a Tuesday
		int year = 1900;
		int month = 1;
		while(year <= 2000){
			if(month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12){
				if(dayOfWeek == 1) sundayCount++;
				dayOfWeek = (dayOfWeek + 31)%7 + 1;	
				month++;
			}
			if(month == 4 || month == 6 || month == 9 || month == 11){
				if(dayOfWeek == 1) sundayCount++;
				dayOfWeek = (dayOfWeek + 30)%7 + 1;		
				month++;
			}
			if(month == 2 ){
				if(dayOfWeek == 1) sundayCount++;
				dayOfWeek = (dayOfWeek + 28)%7 + 1;		
				if(isLeapYear(year) && year != 1900) dayOfWeek = (dayOfWeek+1)%7 + 1;
				month++;
			}
			if(month > 12){
				month = 1;
				year++;
			}
		}
		return sundayCount;
	}
	
	public static boolean isLeapYear(int year){
		if(year%4 == 0) return true;
		return false;
	}
}
