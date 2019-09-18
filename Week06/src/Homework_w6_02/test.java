package Homework_w6_02;

import java.util.Scanner;

public class test {
      
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gpsdata = "";
        String time = "";
         
        String s= in.nextLine();

        System.out.println(s.charAt(18));
        {
			int start = s.indexOf('$');
			int end = s.indexOf('*');
			int result = s.charAt( start+1 );
			for( int i=start+2; i<end; i++)
			{
				result = result ^ s.charAt(i);
			}
			result = result % 65536;
			int check = Integer.parseInt(s.substring(end+1, s.length()), 16);
			boolean flag = false;
			int loc = s.indexOf(',');
			if( result==check )
			{
				flag = true;
				//judge the second string whether it was time
				for( int i=loc+1; i<loc+7 ; i++ )
				{
//					System.out.println(s.charAt(i));
					if( s.charAt(i)>'9' || s.charAt(i)<'0')
					{
						flag = false;
						break;
					}
				}
				if( s.charAt( loc+7 )!= '.')
				{
					flag = false;
				}
				for( int i=loc+8; i<s.indexOf(',',loc+1) ; i++ )
				{
					if( s.charAt(i)>'9' || s.charAt(i)<'0')
					{
						flag = false;
						break;
					}
				}
			}
			if( flag )
			{
				int hour = Integer.parseInt(s.substring(s.indexOf(',')+1,s.indexOf(',')+3 ));
				hour = hour + 8;
				if( hour>24 )
				{
					hour = hour - 24;
				}
				if( hour<10 )
				{
					System.out.println("0"+hour+":"+s.substring(9,11)+":"+s.substring(11,13));
				}
				else
				{
					System.out.println(hour+":"+s.substring(9,11)+":"+s.substring(11,13));					
				}
			}
		}
    }
}