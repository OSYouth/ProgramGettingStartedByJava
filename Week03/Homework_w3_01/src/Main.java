import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number, count_odd, count_even;
		count_odd = count_even = 0;
		number = in.nextInt();
		while(number != -1)
		{
			if((number % 2) == 0)
			{
				count_even = count_even + 1;
			}
			else
			{
				count_odd = count_odd + 1;
			}
			number = in.nextInt();
		}
		System.out.println(count_odd + " " + count_even);

	}

}
