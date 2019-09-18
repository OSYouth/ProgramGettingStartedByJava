/*
 * 这道题比较容易，主要是考察函数调用，刚开始没有看清输出格式，对于素数就是直接输出，没有注意也要输出=，所以测试1错了，也可以看出测试用例只有一个素数
 * 后期也将素数表初始化做成了一个函数，还是有点小成就感的
 * 
 * 1分解质因数（5分）
题目内容：
每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。

输入格式:
一个整数，范围在[2,100000]内。

输出格式：
形如：
n=axbxcxd
或
n=n
所有的符号之间都没有空格，x是小写字母x。

输入样例：
18

输出样例：
18=2x3x3
时间限制：500ms内存限制：32000kb
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