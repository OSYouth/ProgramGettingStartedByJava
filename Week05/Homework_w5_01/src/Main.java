/*
 * A��������ʱ�������̫ˬ�ˣ�����ȴ������̫���ʱ�䣬��Ҫ��ԭ�����߼���������������ϲ������ճ�����룬���������׶�Ӧ��ע��ʹ�õ�
 * һ���Լ��ô�����ٶȻ��д���������һ���渴��ճ���ܶ����û�м�ʱ�Ĺ������������ύ��ʱ�����ĳЩ�������ˣ�����ȴ�ܶ���������
 * �տ�ʼ����д�˺ܶ���ȷ���߼������ǿ��ܾ�����Ϊ����ԭ�򣬵������ǳ����������İѴ���ȫ����һ��Ŷ�
 * ����Ժ��õ���Ŀ�ĵ�һ������Ӧ���Ǻú÷�����������һ��ʼ���ô��룬���ִ�����ȥ�ģ������ܲ��ã�
 * 
 * ����ʽ�ӷ���5�֣�
��Ŀ���ݣ�
һ������ʽ���Ա��Ϊx�ĸ�������ϵ���˻��ĺͣ����磺

���ڣ���ĳ���Ҫ������������ʽ��Ȼ���������������ʽ�ĺͣ�Ҳ���ǰѶ�Ӧ�����ϵ�ϵ�����Ȼ�������
����Ҫ����������Ϊ100��

�����ʽ:
�ܹ�Ҫ������������ʽ��ÿ������ʽ�������ʽ���£�
ÿ�������������֣���һ����ʾ�ݴΣ��ڶ�����ʾ���ݴε�ϵ�������е�ϵ��������������һ��һ��������ݣ����һ��һ����0���ݡ�
ע���һ�к����һ��֮�䲻һ�������ݴν���˳�����У����ĳ���ݴε�ϵ��Ϊ0���Ͳ������������������ˣ�0���ݵ�ϵ��Ϊ0ʱ���ǻ���������������С�

�����ʽ��
������ݿ�ʼ���ν���0�ݣ��磺
2x6+3x5+12x3-6x+20
ע�����е�x��Сд��ĸx���������еķ���֮�䶼û�пո����ĳ���ݵ�ϵ��Ϊ0����Ҫ�����

����������
6 2
5 3
3 12
1 6
0 20
6 2
5 3
2 12
1 6
0 20
���������
4x6+6x5+12x3+12x2+12x+40
ʱ�����ƣ�500ms�ڴ����ƣ�32000kb
 */




import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] polynomial = new int[105];
		int max_mark = 0;	//��ߴ��ݱ��λ
		boolean[] mark = new boolean[105];	//��Ƕ���ʽ��λ����
		int flag = 2;	//��������ʽ����һλ���������һ
		
		while( flag!=0 )
		{
			int i = in.nextInt();
			if( flag==2 )
			{
				polynomial[i] = in.nextInt();
			}
			if( flag==1 )
			{
				int temp = in.nextInt();
				polynomial[i] = polynomial[i] + temp;
			}
				
			if( i==0 )
			{
				flag --;
			}
		}
		
		for(int i=0; i<polynomial.length; i++)
		{
			if( polynomial[i]!=0 )
			{
				max_mark = i; 
				mark[i] = true;
//				System.out.print(i+" ");	
//				System.out.println(polynomial[i]);
			}
		}
		

		

		
		
		if(max_mark>1)
		{
			if( polynomial[max_mark]>1 || polynomial[max_mark]<-1 )
			{
				System.out.print(polynomial[max_mark]+"x");
			}
			if( polynomial[max_mark]==1)
			{
				System.out.print("x");
			}
			if( polynomial[max_mark]==-1)
			{
				System.out.print("-x");
			}
			System.out.print(max_mark);
		}
		
		for(int i=max_mark-1; i>1; i--)
		{
			if( mark[i] && polynomial[i]<-1 )
			{
				System.out.print(polynomial[i]+"x");
			}
			if( mark[i] && polynomial[i]>1 )
			{
				System.out.print("+"+polynomial[i]+"x");
			}
			if( mark[i] && polynomial[i]==1 )
			{
				System.out.print("+x");
			}
			if( mark[i] && polynomial[i]==-1 )
			{
				System.out.print("-x");
			}
			if( mark[i] )
			{
				System.out.print(i);
			}
		}

		if( polynomial[1]<-1 )
		{
			System.out.print(polynomial[1]+"x");
		}
		if( polynomial[1]>1 )
		{
			if( max_mark!=1)
			{
				System.out.print("+"+polynomial[1]+"x");
			}
			else
			{
				System.out.print(polynomial[1]+"x");
			}
		}
		if( polynomial[1]==-1 )
		{
			System.out.print("-x");
		}
		if( polynomial[1]==1 )
		{
			if( max_mark>1)
			{
				System.out.print("+x");
			}
			else
			{
				System.out.print("x");
			}
		}
		
		if( polynomial[0]<=-1 )
		{
			System.out.print(polynomial[0]);
		}
		if( polynomial[0]>=1)
		{
			if( max_mark>0)
			{
				System.out.print("+"+polynomial[0]);
			}
			else
			{
				System.out.print(polynomial[0]);
			}
		}
		if( polynomial[0]==0 && max_mark==0 )
		{
			System.out.print(polynomial[0]);
		}
		System.out.println();
	}

}
