/*
 *  这是一个简单的二维数组应用的题目，甚至都不用判断双方都有赢得情况，但是敲代码实现的过程却不是很满意
 * 最简单的行的判断的确没花什么时间，但是列的判断卡了一阵子，最后还因为判断反对角线没有注意条件重复提交了四五次，实在惭愧
 * 
 * 2井字棋（5分）
题目内容：
嗯，就是视频里说的那个井字棋。视频里说了它的基本思路，现在，需要你把它全部实现出来啦。
你的程序先要读入一个整数n，范围是[3,100]，这表示井字棋棋盘的边长。比如n=3就表示是一个3x3的棋盘。然后，要读入n行，每行n个数字，每个数字是1或0，依次表示[0,0]到[n-1,n-1]位置上的棋子。1表示X，0表示O（大写字母O）。
你的程序要判断其中是否存在某一方获胜，获胜的条件是存在整行或整列或整条对角线或整条反对角线上是相同的棋子。如果存在，则输出代表获胜一方字母：X或O（大写字母X或O）；如果没有任何一方获胜，则输出NIL（三个大写字母，中间是字母I（India的I）。
注意：所给的棋盘上的棋子分布可能出现同一个棋子有多处满足获胜的条件，但是不会出现两种棋子都获胜的情况。

输入格式:
一个代表棋盘大小的数字n，后面跟上nxn个0或1的数字。

输出格式：
三种输出之一：
X
O
NIL
均为大写字母。

输入样例：
4
1 0 0 1
0 1 0 0
0 0 1 0
1 0 0 1

输出样例：
X
时间限制：500ms内存限制：32000kb
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int winner = 2;	//默认状态为2，X获胜为1，O获胜为0
		int size = in.nextInt();
		int[][] cheese = new int[size][size];
//		boolean mark = true;	//有一方胜利后面的程序都无需执行
		
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
				if( j==0 )				//开始因为这个判断还是判断的末尾数而导致有一个用例无法通过
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
