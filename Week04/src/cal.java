import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		double sum;
		while(in.hasNextInt())
		{
			sum = 0;
			int n = in.nextInt();
			int sign = 1;
			for(int i = 1; i <= n; i++)
			{
				sum = sum + 1.0*sign/i;
				sign = -sign;
			}
			System.out.println(sum);
			System.out.printf("%.2f",sum);
			


		}

	}

}
