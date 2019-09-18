import java.util.Scanner;

public class Greatest_common_divisior {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt())
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int divisor=1;
//			if(a>b)
//			{
//				int temp = a;
//				a = b;
//				b = temp;
//			}
//			for(int i = 1; i <= a ;i++ )
//			{
//				if(((b%i)==0) && ((a%i)==0))
//				{
//					divisor = i;
//				}
//			}
			
			while(b!=0)
			{
				int r = a % b;
				a = b;
				b = r;
			}
			divisor = a;
			System.out.println(divisor);
		}

	}

}
