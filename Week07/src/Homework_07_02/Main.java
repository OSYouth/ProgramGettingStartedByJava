/*
 * Ū����߼������Ͼ�û�������ˣ���Ҫע����Ƕ���һ��������ʼ��һ�㶼��forѭ�������棬��Ȼÿ��ѭ�������ʼ��һ�Σ�������ε�cnt��Ϊ�ж����һ���ո��Ƿ�Ҫ����ı�־��
 * ���cnt��num��ȣ�˵�������һ�������ˣ�û�б�Ҫ����ո񣬵��������ʱ���Լ���cnt�ŵ���forѭ�����棬�������Ŀո�û�����
 * ���о���һ��ʼ75��82�У���if����������ŵ�forѭ�����������һ�����ˣ����������������������û���ҵ� 
 * ��֮�Ժ�����forѭ����ʱ��Ҫ��ע��һЩϸ��
 * 
 * 2������5�֣�
��Ŀ���ݣ�
һ�������������������п���������������������һ�������ǡ�õ��ڳ��������������֮�ͣ�������ͳ�Ϊ����������6=1��2��3(6��������1,2,3)��
���ڣ���Ҫдһ�����򣬶�������������n��m��1<=n<m<1000�������[n,m]��Χ�����е�������
��ʾ������дһ���������ж�ĳ�����Ƿ���������

�����ʽ:
�������������Կո�ָ���

�����ʽ��
������е��������Կո�ָ������һ�����ֺ���û�пո����û�У������һ�����С�

����������
1 10

���������
6
ʱ�����ƣ�500ms�ڴ����ƣ�32000kb
 */
//@LC


package Homework_07_02;

import java.util.Scanner;

public class Main {
	
	public static void printPerfectNumber( int n, int m){
		int num = 0;	
		int cnt = 0;
		for( int i=n; i<=m; i++)
		{
			if( isPerfectNumber(i) )
			{
				num ++;
			}
		}
//		System.out.println(num);
		for( int i=n; i<=m; i++)
		{
			if( num>0 && isPerfectNumber(i))
			{
				System.out.print(i);
				cnt ++;
				if( cnt!=num )
				{
					System.out.print(" ");
				}
			}
			if( num==0 )
			{
				System.out.println();
			}
		}
	}
	
	public static boolean isPerfectNumber( int k ){
		boolean judge = false;
		boolean[] flag = new boolean[1000];
		for( int i=1; i<k; i++)
		{
			if( k%i==0 )
			{
				flag[i] = true;
			}
		}
		int sum = 0;
		for( int i=1; i<k; i++)
		{
			if( flag[i] )
			{
//			System.out.print(i+" ");
			sum = sum + i;
			}
		}
//		System.out.println();
		if( sum==k )
		{
			judge = true;
//			System.out.println("yes"+k);
		}
		return judge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,m;
		n = in.nextInt();
		m = in.nextInt();
		printPerfectNumber(n,m);
//		isPerfectNumber(n);
	}
}