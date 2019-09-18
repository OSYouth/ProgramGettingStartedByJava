import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		int result = 0;
		int count = 0;

		while(number > 0)
		{
			int digit = number % 10;
			int flag_digit = digit % 2;
			number = number /10;
			count = count + 1;
			int flag_count = count % 2;
			if (flag_count == flag_digit)
			{
				result = result + (int)Math.pow(2,(count -1));
			}
		}
		System.out.println(result);

	}

}
