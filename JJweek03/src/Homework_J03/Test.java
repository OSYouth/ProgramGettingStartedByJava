package Homework_J03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	private ArrayList<String> table = new ArrayList<String>();
	public void cityName(String s){
		table.add(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main list = new Main();
		Scanner in = new Scanner(System.in);
		while(true)
		{
			String s = in.next();
			System.out.println(s);
			if(s.equals("###"))
			{
				break;
			}
			else
			{
				list.cityName(s);
			}
		}
		
	}

}
