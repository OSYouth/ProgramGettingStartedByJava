/*
 * 弄清楚逻辑基本上就没有问题了，需要注意的是对于一个变量初始化一般都在for循环的外面，不然每次循环都会初始化一次，就像这次的cnt作为判断最后一个空格是否要输出的标志，
 * 如果cnt和num相等，说明是最后一个完数了，没有必要输出空格，但是最初的时候自己把cnt放到了for循环里面，导致最后的空格没有输出
 * 还有就是一开始75到82行，把if里面的条件放到for循环的条件语句一起与了，结果后面两个完数就死都没有找到 
 * 总之以后在用for循环的时候要多注意一些细节
 * 
 * 2完数（5分）
题目内容：
一个正整数的因子是所有可以整除它的正整数。而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。例如6=1＋2＋3(6的因子是1,2,3)。
现在，你要写一个程序，读入两个正整数n和m（1<=n<m<1000），输出[n,m]范围内所有的完数。
提示：可以写一个函数来判断某个数是否是完数。

输入格式:
两个正整数，以空格分隔。

输出格式：
其间所有的完数，以空格分隔，最后一个数字后面没有空格。如果没有，则输出一个空行。

输入样例：
1 10

输出样例：
6
时间限制：500ms内存限制：32000kb
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