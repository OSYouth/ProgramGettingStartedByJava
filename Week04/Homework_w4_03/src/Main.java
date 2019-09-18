import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int sum_n = 0;
		int sum_m = 0;
		int temp = 0;
		int result = 0;
		
		boolean is_prime;
		//思路：计算前(n-1)个素数的和sum_n, 以及m个素数和sum_m,然后后者减前者
		//由于素数判断除了问题，导致卡了很久
		for(int num = 2; num < 10000; num++)
		{
			is_prime = true;
			for(int i = 2; i < num; i++)
			{
				if((num % i) == 0)
				{
					is_prime = false;
					break;
				}
			}
			if(is_prime)
			{
				n--;
				sum_n = sum_n + num;	
//				System.out.print(num + " ");
			}
			if(n == 0)
			{
				temp = num;	
//刚开始是在一开头就让n-1，在m,n不相等的情况下可以得出正确结果
//但是如果m,n相等的话就会让n少一个数，而且如果n=1的话值为空
//这也说明一开始就减判断条件是个很不明智的选择和很不好的习惯
//				System.out.println(temp);
				break;
			}
		}		
//		System.out.println();
		for(int num = 2; num < 10000; num++)
		{
			is_prime = true;
			for(int i = 2; i < num; i++)
			{
				if((num % i) == 0)
				{
					is_prime = false;
					break;
				}
			}
			if(is_prime)
			{
				m--;
				sum_m = sum_m + num;	
//				System.out.print(num + " ");
			}
			if(m == 0)
			{
				break;
			}
		}		
		result = sum_m - sum_n + temp;
//		System.out.println(sum_n);
//		System.out.println(sum_m);		
		System.out.println(result);
	}

}
