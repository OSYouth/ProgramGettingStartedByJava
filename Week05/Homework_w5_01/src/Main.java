/*
 * A出这道题的时候真的是太爽了，但是却花费了太多的时间，主要的原因还是逻辑结果不清楚，而且喜欢复制粘贴代码，这点在这个阶段应该注意使用的
 * 一来自己敲代码的速度还有待提升，另一方面复制粘贴很多变量没有及时改过来，以至于提交的时候可能某些用例对了，但是却很多用例错了
 * 刚开始可能写了很多正确的逻辑，但是可能就是因为这种原因，导致老是出错，最后沉下心把代码全部改一遍才对
 * 因此以后拿到题目的第一件事情应该是好好分析，而不是一开始就敲代码，发现错了再去改，这样很不好！
 * 
 * 多项式加法（5分）
题目内容：
一个多项式可以表达为x的各次幂与系数乘积的和，比如：

现在，你的程序要读入两个多项式，然后输出这两个多项式的和，也就是把对应的幂上的系数相加然后输出。
程序要处理的幂最大为100。

输入格式:
总共要输入两个多项式，每个多项式的输入格式如下：
每行输入两个数字，第一个表示幂次，第二个表示该幂次的系数，所有的系数都是整数。第一行一定是最高幂，最后一行一定是0次幂。
注意第一行和最后一行之间不一定按照幂次降低顺序排列；如果某个幂次的系数为0，就不出现在输入数据中了；0次幂的系数为0时还是会出现在输入数据中。

输出格式：
从最高幂开始依次降到0幂，如：
2x6+3x5+12x3-6x+20
注意其中的x是小写字母x，而且所有的符号之间都没有空格，如果某个幂的系数为0则不需要有那项。

输入样例：
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
输出样例：
4x6+6x5+12x3+12x2+12x+40
时间限制：500ms内存限制：32000kb
 */




import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] polynomial = new int[105];
		int max_mark = 0;	//最高次幂标记位
		boolean[] mark = new boolean[105];	//标记多项式有位数的
		int flag = 2;	//两个多项式，第一位输入遇零减一
		
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
