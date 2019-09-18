package onclass;

import java.util.Scanner;

public class SumFunction {
	
	private static int sum( int a, int b ) {
		// TODO Auto-generated method stub
//		this.a = a;
//		this.b = b;
		int i;
		int sum = 0;
		for( i=a; i<=b; i++)
		{
			sum = sum + i;
		}
//		System.out.println( "The sum from "+1+" to "+10+" is: "+sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println( "The sum from "+1+" to "+10+" is: "+sum(1,10));
		System.out.println( "The sum from "+1+" to "+10+" is: "+sum(20,30));
		System.out.println( "The sum from "+1+" to "+10+" is: "+sum(35,45));
	}
}
