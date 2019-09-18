/*summary:�����ҵ�ύ�İ汾���ɵ˲���ָ���İ汾���տ�ʼ�Լ�ûд������Ҫ�����¼���ԭ��
 * 1.�տ�ʼ��class Fraction�������һ������()�������ڱ��뱨�����Ǻþö�û���ҵ�ԭ��
 *   Ӱ��ı�̵����飬���Ͻ�ֹʱ���ڼ������ˣ�
 *   �´���ע���̹淶��ͬʱ��ҲҪע�ⲻҪ�������������񶼷��ڽ�ֹʱ��֮ǰ�Ͻ��ȣ�
 *   ������Ӱ�������飬ҲӰ���˵�����ܵĽ��Ȱ��ţ���Ҫע��д����Ҫ��ƽ�����侲
 * 2.��Ϊ�����������û���õ���һֱ�ھ���ΪʲôҪת��double
//	double toDouble()	
//	{
//		
//	}
	�Ժ�Ӧ��ע�⺯��û�õ���û�õ�������д������Ϊ���Ժ���չ���ύ�����������Ժ���
	��������޸�Ҳ���Ե�ʱ���ټ�
  *3.��Ϊ��thisû�����͸�����ܸо���ô��ֵ��ȥ��ֵ�������Ծ����ܻ���
  *4.��������˼�뻹û��ת����������е����Ϊ���󶼵���ônewһ��
     Fraction b = new Fraction(in.nextInt(),in.nextInt());
         ��ˣ�Fraction plus(Fraction r)����������һֱǱ��ʶ����ΪFraction���Ǹ����캯��
        ��һֱ����Ϊʲôֻ��һ��������Ҳû�����Ų�������Ҫ������

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

//	����һ��a/b�ķ�����	
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
//	������ת��Ϊdouble	
//	double toDouble()	
//	{
//		
//	}
//	���Լ��ķ�����r�ķ�����ӣ�����һ���µ�Fraction�Ķ���
//	ע��Сѧ���꼶ѧ���������������ӵĹ���    
	Fraction plus(Fraction r)	
	{
		int numerator = up*r.down + down*r.up;
		int denominator = down*r.down;
		return new Fraction(numerator, denominator);
	}
//	���Լ��ķ�����r�ķ�����ˣ�����һ���µ�Fraction�Ķ���
	Fraction multiply(Fraction r)
	{
		int numerator = up*r.up;
		int denominator = down*r.down;
		return new Fraction(numerator, denominator);
	}
//	���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس����С�
//	���������1/1��Ӧ�����1��
//	�����Ӵ��ڷ�ĸʱ������Ҫ����������֣���31/30��һ����ȷ�������
//	ע�⣬�ڴ��������������Ӧ�û������Ϊ�����ʽ����2/4Ӧ�ñ�����Ϊ1/2��   
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
