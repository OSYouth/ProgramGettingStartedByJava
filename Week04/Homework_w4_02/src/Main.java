import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		int count_num = 0;
		int count_res = 0;
		if(number < 0)
		{
			System.out.print("fu ");
			number = Math.abs(number);
		}
		if(number == 0)
		{
			System.out.print("ling");
		}
		
		//������������û��Ҫ
		while(number > 0)
		{
			int digit = number % 10;
			result = result * 10 + digit;
			number = number /10;
			count_num = count_num + 1;
		}
//		int mark = result;	//���Դ洢���������������result�����λ���������ı�result��ֵ
//		while(mark > 0)
//		{
//			int digit = mark % 10;
//			mark = mark /10;
//			count_res = count_res + 1;
//		}

		
//		System.out.println(result);
		while(result > 0)
		{
			int key = result % 10;
			switch (key) {
			case 1:
				System.out.print("yi");
				break;
			case 2:
				System.out.print("er");
				break;
			case 3:
				System.out.print("san");
				break;
			case 4:
				System.out.print("si");
				break;
			case 5:
				System.out.print("wu");
				break;
			case 6:
				System.out.print("liu");
				break;
			case 7:
				System.out.print("qi");
				break;
			case 8:
				System.out.print("ba");
				break;
			case 9:
				System.out.print("jiu");
				break;
			case 0:
				System.out.print("ling");
				break;
	
			default:
				break;
			}
			result = result / 10;
			count_res = count_res + 1;
			if(result > 0)	
			{
				System.out.print(" ");
			}
		}
		while(count_num != count_res)
		{
			System.out.print(" ling");
			count_num = count_num - 1;
		}
	}

}

