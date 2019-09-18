import java.util.Scanner;

public class decomposition {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		int result = 0;
		while(number > 0)
		{
			int digit = number % 10;
			result = result * 10 + digit;
			System.out.print(digit);
			number = number /10;
		}
		System.out.println( );
		System.out.println(result);

	}

}
