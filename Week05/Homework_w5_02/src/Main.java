/*
 *  ����һ���򵥵Ķ�ά����Ӧ�õ���Ŀ�������������ж�˫������Ӯ������������ô���ʵ�ֵĹ���ȴ���Ǻ�����
 * ��򵥵��е��жϵ�ȷû��ʲôʱ�䣬�����е��жϿ���һ���ӣ������Ϊ�жϷ��Խ���û��ע�������ظ��ύ������Σ�ʵ�ڲ���
 * 
 * 2�����壨5�֣�
��Ŀ���ݣ�
�ţ�������Ƶ��˵���Ǹ������塣��Ƶ��˵�����Ļ���˼·�����ڣ���Ҫ�����ȫ��ʵ�ֳ�������
��ĳ�����Ҫ����һ������n����Χ��[3,100]�����ʾ���������̵ı߳�������n=3�ͱ�ʾ��һ��3x3�����̡�Ȼ��Ҫ����n�У�ÿ��n�����֣�ÿ��������1��0�����α�ʾ[0,0]��[n-1,n-1]λ���ϵ����ӡ�1��ʾX��0��ʾO����д��ĸO����
��ĳ���Ҫ�ж������Ƿ����ĳһ����ʤ����ʤ�������Ǵ������л����л������Խ��߻��������Խ���������ͬ�����ӡ�������ڣ�����������ʤһ����ĸ��X��O����д��ĸX��O�������û���κ�һ����ʤ�������NIL��������д��ĸ���м�����ĸI��India��I����
ע�⣺�����������ϵ����ӷֲ����ܳ���ͬһ�������жദ�����ʤ�����������ǲ�������������Ӷ���ʤ�������

�����ʽ:
һ���������̴�С������n���������nxn��0��1�����֡�

�����ʽ��
�������֮һ��
X
O
NIL
��Ϊ��д��ĸ��

����������
4
1 0 0 1
0 1 0 0
0 0 1 0
1 0 0 1

���������
X
ʱ�����ƣ�500ms�ڴ����ƣ�32000kb
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int winner = 2;	//Ĭ��״̬Ϊ2��X��ʤΪ1��O��ʤΪ0
		int size = in.nextInt();
		int[][] cheese = new int[size][size];
//		boolean mark = true;	//��һ��ʤ������ĳ�������ִ��
		
		for(int i=0; i<cheese.length; i++)
		{
			for(int j=0; j<cheese.length; j++)
			{
				cheese[i][j] = in.nextInt();
			}
		}
		
		for(int i=0; /*mark &&*/ i<cheese.length; i++)		//judge \
		{
			int flag = cheese[i][0];
			for(int j=1; j<cheese[i].length; j++)
			{
				if( flag!=cheese[j][j] )
				{
					break;
				}
				if( j==cheese[i].length-1 )
				{
					winner = flag;
//					if( winner!=2 )
//					{
//						mark = false;
//					}
				}
			}
//			System.out.print(flag);
//			System.out.println(winner);
		}
		
		for(int i=0; /*mark &&*/  i<cheese.length; i++)		//judge /
		{
			int flag = cheese[i][cheese.length-1-i];
			for(int j=cheese[i].length-1; j>0; j--)
			{
				if( flag!=cheese[j][j] )
				{
					break;
				}
				if( j==0 )				//��ʼ��Ϊ����жϻ����жϵ�ĩβ����������һ�������޷�ͨ��
				{
					winner = flag;
//					if( winner!=2 )
//					{
//						mark = false;
//					}
				}
			}
//			System.out.print(flag);
//			System.out.println(winner);
		}
		
		for(int i=0; /*mark &&*/  i<cheese.length; i++)		//judge row
		{
			int flag = cheese[i][0];
			for(int j=1; j<cheese[i].length; j++)
			{
				if( flag!=cheese[i][j] )
				{
					break;
				}
				if( j==cheese[i].length-1 )
				{
					winner = flag;
//					if( winner!=2 )
//					{
//						mark = false;
//					}
				}
			}
//			System.out.print(flag);
//			System.out.println(winner);
		}
			
		for(int i=0; /*mark &&*/ i<cheese[0].length; i++)		//judge column
		{
			int flag = cheese[0][i];
			for(int j=1; j<cheese.length; j++)
			{
				if( flag!=cheese[j][i] )
				{
					break;
				}
				if( j==cheese.length-1 )
				{
					winner = flag;
//					if( winner!=2 )
//					{
//						mark = false;
//					}
				}
			}
//			System.out.print(flag);
//			System.out.println(winner);
		}
		
		if( winner==1 )
		{
			System.out.println("X");
		}
		else if( winner==0 )
		{
			System.out.println("O");
		}
		else
		{
			System.out.println("NIL");
		}
	}

}
