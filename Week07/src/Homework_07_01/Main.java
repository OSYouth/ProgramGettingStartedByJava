/*
 * �����Ƚ����ף���Ҫ�ǿ��캯�����ã��տ�ʼû�п��������ʽ��������������ֱ�������û��ע��ҲҪ���=�����Բ���1���ˣ�Ҳ���Կ�����������ֻ��һ������
 * ����Ҳ���������ʼ��������һ�������������е�С�ɾ͸е�
 * 
 * 1�ֽ���������5�֣�
��Ŀ���ݣ�
ÿ����������������������д�ɼ���������Ҳ�ɳ�Ϊ��������˵���ʽ���⼸�������Ͷ�������������������������磬6���Ա��ֽ�Ϊ2x3����24���Ա��ֽ�Ϊ2x2x2x3��
���ڣ���ĳ���Ҫ����һ��[2,100000]��Χ�ڵ�������Ȼ����������������ֽ�ʽ���������ľ�������ʱ�����������

�����ʽ:
һ����������Χ��[2,100000]�ڡ�

�����ʽ��
���磺
n=axbxcxd
��
n=n
���еķ���֮�䶼û�пո�x��Сд��ĸx��

����������
18

���������
18=2x3x3
ʱ�����ƣ�500ms�ڴ����ƣ�32000kb
 */
//@LC



package Homework_07_01;

import java.util.Scanner;

public class Main {
	
	public static void intializition(boolean[] prime){

		for( int i=0; i<prime.length; i++)
		{
			prime[i] = true;
		}
		for(int i=2; i<prime.length; i++)
		{
			if( prime[i] )
			{
				for( int x=2; x*i<prime.length; x++)
				{
					prime[x*i] = false;
				}
			}
		}
	}
	
	public static void decomposition( int num ) {
		//Creat the prime list
//		boolean[] prime = new boolean[100005];
//		for( int i=0; i<prime.length; i++)
//		{
//			prime[i] = true;
//		}
//		for(int i=2; i<prime.length; i++)
//		{
//			if( prime[i] )
//			{
//				for( int x=2; x*i<prime.length; x++)
//				{
//					prime[x*i] = false;
//				}
//			}
//		}
		boolean is_prime[] = new boolean[100005];
		intializition(is_prime);
		System.out.print(num+"=");
		if( is_prime[num] )
		{
			System.out.println(num);
		}
		else
		{
			int flag = 1;	//the first number makes without x
			for( int i=2; i<=num;)
			{
				if( num%i==0 )
				{
					if( flag>1 )
					{
						System.out.print("x");
					}
					System.out.print(i);
					flag++;
					num = num/i;
				}
				else
				{
					i++;
				}
				if( num==1 )
				{
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		decomposition(num);
	}
}