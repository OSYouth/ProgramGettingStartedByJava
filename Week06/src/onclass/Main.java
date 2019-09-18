package onclass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		char c = 'º¹';
//		c++;
//		System.out.println((int)'a');
//		System.out.println((int)'4'-'0');
//		
//		System.out.println("abc\td");
//		
//		Integer i = 100 ;
//		int k = 8;
//		System.out.println(i);
//		Integer m; 
//		m = i;
//		i = 50;
////		i = k;
//		System.out.println(m);
//		System.out.println(i);
//		Double d;
//		System.out.println(k);
		
		String s1 = "0123456389ºº×Ö";
		int loc = s1.indexOf('3');
		
		System.out.println(s1.indexOf('3',loc+1));
		
	}

}
