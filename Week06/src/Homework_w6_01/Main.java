/*�տ�ʼ�߼�û����ã������жϳ������⣬����һ�����Բ���ͨ��������Ϊ�����Ƹ��������������⣬���������ǿո��.��ɵģ�������ֻ��.��ʱ�������ַ�������Ϊ0������ʱӦ��û�������
 * 
 * 
 * 1���ʳ��ȣ�4�֣�
��Ŀ���ݣ�
��ĳ���Ҫ����һ���ı��������Կո�ָ�Ϊ���ɸ����ʣ��ԡ�.����������Ҫ��������ı���ÿ�����ʵĳ��ȡ�����ĵ����������޹أ����԰������ַ��ţ����硰it's����һ�����ʣ�����Ϊ4��ע�⣬���п��ܳ��������Ŀո�

�����ʽ:
������һ���и���һ���ı����ԡ�.����������β�ľ�Ų��ܼ��������һ�����ʵĳ����ڡ�

�����ʽ��
��һ������������ı���Ӧ�ĵ��ʵĳ��ȣ�ÿ������֮���Կո��������ĩû�����Ŀո�

����������
It's great to see you here.

���������
4 5 2 3 3 4
ʱ�����ƣ�500ms�ڴ����ƣ�32000kb
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
