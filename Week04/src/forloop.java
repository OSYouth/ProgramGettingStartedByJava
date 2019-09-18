import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int i,j=6;
//		j +=i;
		
//		int i=6;
//		do {
//		    System.out.println(i--);
//		} while (false);
		
//		int i=0;
//		while ( true ) 
//		{
//		    if ( ++i > 10 )
//		        break;
//		}
//		System.out.println(i);
//		
//		if ( i<= 6 ) 
//		    System.out.println("hello");;
//		else
//		    System.out.println("bye-bye");;
		
//		int a = 3;
//		int b = 1;
//		if ( a = b )
//		    System.out.println("=");
//		else
//		    System.out.println("!=");

		Scanner in = new Scanner(System.in);
		int i;
		while(in.hasNextInt())
		{
			i = in.nextInt() % 4;
			System.out.println(i);
		}
		
		
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int factor = 1;
//		
//		int i = 1;
//		while(i <= n)
//		{
//			factor = factor * i;
//			i = i + 1 ;
//		}
////		for(int i = 1; i <= n; i++)
////		{
////			factor = factor * i;
////		}
//		System.out.println(factor);
		
//		int j=4;
//		for ( int i=j; i<=2*j; i++ ) {
//		   switch ( i/j ) {
//		   case 0:
//		   case 1: System.out.print("#"); break;
//		   case 2: System.out.print("*");
//		   }
//		}
	}

}
