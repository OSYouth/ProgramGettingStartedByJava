import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int sum_n = 0;
		int sum_m = 0;
		int temp = 0;
		int result = 0;
		
		boolean is_prime;
		//˼·������ǰ(n-1)�������ĺ�sum_n, �Լ�m��������sum_m,Ȼ����߼�ǰ��
		//���������жϳ������⣬���¿��˺ܾ�
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
//�տ�ʼ����һ��ͷ����n-1����m,n����ȵ�����¿��Եó���ȷ���
//�������m,n��ȵĻ��ͻ���n��һ�������������n=1�Ļ�ֵΪ��
//��Ҳ˵��һ��ʼ�ͼ��ж������Ǹ��ܲ����ǵ�ѡ��ͺܲ��õ�ϰ��
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
