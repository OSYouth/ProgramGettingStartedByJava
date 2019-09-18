import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int x;
		int[] numbers = new int[10];
		double sum = 0;
		int cnt = 0;
		x = in.nextInt();
		while( x != -1)
		{
			numbers[cnt] = x;
			sum = sum + x;
			cnt ++;
			x = in.nextInt();
		}
		if( cnt > 0 )
		{
			double average = sum/cnt;
			System.out.println(average);
			for( int i = 0; i < cnt; i++)
			{
				if(numbers[i] > average)
				{
					System.out.println(numbers[i]);
				}
			}
		}

	}

}
