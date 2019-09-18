/*summary:这次作业提交的版本是由邓昌能指导的版本，刚开始自己没写出，主要有以下几个原因：
 * 1.刚开始的class Fraction后面加了一对括号()，以至于编译报错，但是好久都没有找到原因，
 *   影响的编程的心情，加上截止时间在即，慌了，
 *   下次在注意编程规范的同时，也要注意不要把所有事情任务都放在截止时间之前赶进度，
 *   这样既影响了心情，也影响了当天可能的进度安排，更要注意写代码要心平气和冷静
 * 2.因为这个函数方法没有用到，一直在纠结为什么要转成double
//	double toDouble()	
//	{
//		
//	}
	以后应当注意函数没用到就没用到，可以写在这里为了以后拓展，提交如果报错或者以后工作
	被打回来修改也可以到时候再加
  *3.因为对this没有理解透彻，总感觉这么赋值过去赋值过来不对劲，很混乱
  *4.面向对象的思想还没有转换过来，机械的认为对象都得这么new一下
     Fraction b = new Fraction(in.nextInt(),in.nextInt());
         因此，Fraction plus(Fraction r)中括号里面一直潜意识的认为Fraction是那个构造函数
        还一直纠结为什么只有一个参数，也没有想着参数还得要用括号

*/

package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(),in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction
{
//	int a,b;
	int up,down;
	double far;

//	构造一个a/b的分数。	
	Fraction(int up,int down)
	{
		this.up = up;
		this.down = down;
		gcd(up,down);
	}
	void gcd(int a,int b)
	{
		int divisor=1;
		while(b!=0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		divisor = a;
		up = up/divisor;
		down = down/divisor;
	}
//	将分数转换为double	
//	double toDouble()	
//	{
//		
//	}
//	将自己的分数和r的分数相加，产生一个新的Fraction的对象。
//	注意小学四年级学过两个分数如何相加的哈。    
	Fraction plus(Fraction r)	
	{
		int numerator = up*r.down + down*r.up;
		int denominator = down*r.down;
		return new Fraction(numerator, denominator);
	}
//	将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
	Fraction multiply(Fraction r)
	{
		int numerator = up*r.up;
		int denominator = down*r.down;
		return new Fraction(numerator, denominator);
	}
//	将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。
//	如果分数是1/1，应该输出1。
//	当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
//	注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。   
	void print()
	{
		if( up==down )
		{
			System.out.println("1");
		}
		else
		{
			System.out.println(up+"/"+down);
		}
	}
}
