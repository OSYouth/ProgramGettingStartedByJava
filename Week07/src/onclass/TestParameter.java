package onclass;

import java.util.Scanner;

public class TestParameter {
	
	public static void add( int[] a )
	{
		for( int i=0; i<a.length; i++)
		{
			a[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num=0;
		System.out.println(num);
		int[] a = new int[10];
		for( int k : a )
		{
			System.out.print(k+" ");
		}
		int[] test = {1,2,3};
		for( int k : test )
		{
			System.out.print(k+" ");
		}
		System.out.println();
		add(test);
		for( int k : test )
		{
			System.out.print(k+" ");
		}
	}
}