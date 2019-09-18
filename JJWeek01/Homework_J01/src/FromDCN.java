
import java.util.Scanner;

public class FromDCN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("���������a�ķ�ĸ��"+in.nextInt());
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
//	����һ��a/b�ķ�����	
	Fraction(int up,int down)
	{
		this.up = up;
		this.down = down;
	}
//	������ת��Ϊdouble	
	double toDouble()	
	{
		//����
		double divisor = this.down;
		//������
		double dividend = this.up;
		return dividend/divisor;
		
	}
//	���Լ��ķ�����r�ķ�����ӣ�����һ���µ�Fraction�Ķ���
//	ע��Сѧ���꼶ѧ���������������ӵĹ���    
	Fraction plus(Fraction r)	
	{
		//��ĸ
		int denominator = this.down*r.down;
		//����
		int numerator = this.up*r.down+this.down*r.up;
		return new Fraction(numerator,denominator);
		
	}
//	���Լ��ķ�����r�ķ�����ˣ�����һ���µ�Fraction�Ķ���
	Fraction multiply(Fraction r)
	{
		//��ĸ
		int denominator = this.down*r.down;
		//����
		int numerator = this.up*r.up;
		return new Fraction(numerator,denominator);
		
	}
//	���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس����С�
//	���������1/1��Ӧ�����1��
//	�����Ӵ��ڷ�ĸʱ������Ҫ����������֣���31/30��һ����ȷ�������
//	ע�⣬�ڴ��������������Ӧ�û������Ϊ�����ʽ����2/4Ӧ�ñ�����Ϊ1/2��   
	void print()
	{
		//����ط�Ū������С��Լ���ķ���
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