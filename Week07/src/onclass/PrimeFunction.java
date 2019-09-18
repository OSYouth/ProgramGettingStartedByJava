package onclass;

import java.util.Scanner;

public class PrimeFunction {
	
	public static boolean isPrime( int i) {
		boolean is_prime = true;
		for( int k=2; k<i; k++)
		{
			if( i%k==0 )
			{
				is_prime = false;
				break;
			}
		}
		return is_prime;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		if( m==1 )
		{
			m=2;
		}
		int cnt = 0;
		int sum = 0;
		for( int i=m; i<=n; i++)
		{
			
			if( isPrime(i) )
			{
				sum = sum + i;
				cnt++;
			}			
		}
		System.out.println(sum/cnt);
	}
}
