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
			prime[cnt] = x;	//ע���Լ�д������ʱ�����ѭ�����ǳ����ƿ�һ��ѭ�����������Ƿ��ڶ���ѭ�����棬����߼�����
			cnt ++;
		}
		for(int k : prime)
		{
			System.out.print(k + " ");
		}	

	}

}
