import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] prime = new int[50];
		
		prime[0] = 2;
		int cnt = 1;
	
		LOOP:
		for(int x=3; cnt<50; x++)
		{
			for(int i=0; i<cnt; i++)
			{
				if( x%prime[i] == 0)
				{
					continue LOOP;
				}
			}
			prime[cnt] = x;	//注意自己写素数的时候二层循环老是出错，破开一重循环的条件老是放在二重循环里面，造成逻辑错误
			cnt ++;
		}
		for(int k : prime)
		{
			System.out.print(k + " ");
		}	

	}

}
