
import java.util.Scanner;

public class FromDCN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("请输入分数a的分母："+in.nextInt());
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
	int a,b;
	int up,down;
//	构造一个a/b的分数。	
	Fraction(int up,int down)
	{
		this.up = up;
		this.down = down;
	}
//	将分数转换为double	
	double toDouble()	
	{
		//除数
		double divisor = this.down;
		//被除数
		double dividend = this.up;
		return dividend/divisor;
		
	}
//	将自己的分数和r的分数相加，产生一个新的Fraction的对象。
//	注意小学四年级学过两个分数如何相加的哈。    
	Fraction plus(Fraction r)	
	{
		//分母
		int denominator = this.down*r.down;
		//分子
		int numerator = this.up*r.down+this.down*r.up;
		return new Fraction(numerator,denominator);
		
	}
//	将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
	Fraction multiply(Fraction r)
	{
		//分母
		int denominator = this.down*r.down;
		//分子
		int numerator = this.up*r.up;
		return new Fraction(numerator,denominator);
		
	}
//	将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。
//	如果分数是1/1，应该输出1。
//	当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
//	注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。   
	void print()
	{
		//这个地方弄个求最小公约数的方法
		int divisor = commonDivisor(this.up,this.down);
		System.out.println(this.up/divisor+"/"+this.down/divisor);
		
	}
	
	
	int commonDivisor(int up,int down){
		int divisor=1;
		while(down!=0)
		{
			int r = up % down;
			up = down;
			down = r;
		}
		divisor = up;
		return divisor;
	}
  
}