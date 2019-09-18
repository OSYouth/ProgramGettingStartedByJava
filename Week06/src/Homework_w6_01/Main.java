/*刚开始逻辑没处理好，导致判断出现问题，总有一个测试不能通过，本以为是类似浮点数这样的问题，后来发现是空格和.造成的，，单独只有.的时候会输出字符串长度为0，而此时应该没有输出的
 * 
 * 
 * 1单词长度（4分）
题目内容：
你的程序要读入一行文本，其中以空格分隔为若干个单词，以‘.’结束。你要输出这行文本中每个单词的长度。这里的单词与语言无关，可以包括各种符号，比如“it's”算一个单词，长度为4。注意，行中可能出现连续的空格。

输入格式:
输入在一行中给出一行文本，以‘.’结束，结尾的句号不能计算在最后一个单词的长度内。

输出格式：
在一行中输出这行文本对应的单词的长度，每个长度之间以空格隔开，行末没有最后的空格。

输入样例：
It's great to see you here.

输出样例：
4 5 2 3 3 4
时间限制：500ms内存限制：32000kb
 * 
 */

package Homework_w6_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		while( (String s = in.next())!=null )
//		{
//			System.out.print(s.length());
//		}	
		
//		System.out.println(in.next().in);
		while(true)
		{
			String s = in.next();
			if( s.lastIndexOf('.')==s.length()-1 )
			{
				if( s.lastIndexOf('.')!=0 )
				{
					System.out.print(s.length()-1);
				}
				break;
			}
			else
			{
				System.out.print(s.length()+" ");
			}
		}
	}
}
