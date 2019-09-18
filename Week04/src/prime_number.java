import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	
		int is_prime =1;
		for(int i = 2; i < n; i ++)
		{
			if( n % i == 0)
			{
				is_prime = 0;
				break;
			}
		}
//		for(int n = 2; n<200; n++)
//		{
//			is_prime = 1;
//			for(int i = 2; i < n; i ++)
//			{
//				if( n % i == 0)
//				{
//					is_prime = 0;
//					break;
//				}
//			}
//			if(is_prime == 1)
//			{
//				System.out.print(n + " " );
//			}
//		}
		if(is_prime == 1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}

	}

}
