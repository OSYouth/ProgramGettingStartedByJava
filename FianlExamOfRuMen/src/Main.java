import java.util.Scanner;

public class Main {  
	
	public static boolean judgeHigh( char c ){
		boolean mark = false;
		if( c=='*' || c=='/' )
		{
			mark = true;
		}
		return mark;
	}	
	public static boolean judgeLow( char c ){
		boolean mark = false;
		if( c=='+' || c=='-' )
		{
			mark = true;
		}
		return mark;
	}
	
	public static int nearLeft( int i,boolean[] flag ){
		int loc = 0;
		for( int k=i; k>0; k--)
		{
			if( flag[k] )
			{
				loc = k;
				break;
			}
		}
		return loc;
	}
	
	public static int nearRight( int i,boolean[] flag ){
		int loc = flag.length;
		for( int k=i; k<flag.length ; k++)
		{
			if( flag[k] )
			{
				loc = k;
				break;
			}
		}
		return loc;
	}
	
    public static void main(String[] args){  
        Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		boolean[] flag = new boolean[s.length()];
		//运算符位标记为真
		for( int i=0; i<s.length(); i++ )
		{
			if( s.charAt(i)>'9' || s.charAt(i)<'0')
			{
				flag[i] = true;
			}
		}
		int min = 0;
		int max = s.length();
		int left = 0;
		int right = s.length();
		boolean no_cal = true;	
		for( boolean k : flag )
		{
			if( k )
			{
				no_cal = false;
			}
		}
		
		if( no_cal )
		{
			System.out.println(Integer.parseInt(s));
		}
		else
		{
			for( int i=0; i<s.length(); i++ )
			{
				while( flag[i] )
				{
					if( judgeHigh(s.charAt(i)) )
					{
						min = nearLeft(i,flag);
						max = nearRight(i,flag);
						System.out.println(6666);
					}
				}
			}
		}
    }  
}  