import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int num = in.nextInt();
		while(num != -1)
		{
			sum = sum + num;
			count = count + 1;
			num = in.nextInt();
		}
		System.out.println("average = " + (double)sum/count);

	}

}
