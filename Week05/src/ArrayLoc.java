import java.util.Scanner;

public class ArrayLoc {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int[] data = {3, 2, 5, 7, 4, 9, 11, 34, 12, 28};
		int x = in.nextInt();
		int loc = -1;
		
		boolean found = false;
		for(int k:data)
		{
			if( k==x )
			{
				found = true;
				break;
			}
		}
		System.out.println(found);
		
		for(int i=0; i<data.length; i++)
		{
			if( data[i]==x )
			{
				loc = i;
				break;
			}
		}
		if( loc>-1 )
		{
			System.out.println("the "+(loc+1)+" number is " + x);
		}
		else
		{
			System.out.println(x+" is not in the queue.");
		}

	}

}
