package week3.day2;

public class Squareroot {
	
	public static void main(String[] args) {
		
		
		System.out.println(mysqrt(4));
		System.out.println(mysqrt(8));
		
	}
	public static int mysqrt(int x)
	
	{
		   int temp;		
		   int sqr = x/2;
			
			do {
				
				temp = sqr;				
				sqr = (temp+ (x/temp))/2;
			} while ((temp-sqr)!=0);
		
		return sqr;
	}
	}	
	


