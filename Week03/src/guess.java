import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);	//[0,1)-->[0,100)-->[1,100]
		int a;
		int count = 0;
		do{
			a = in.nextInt();
			count = count +1;
			if(a > number)
			{
				System.out.println("too large");
			}
			else
			{
				System.out.println("too small");
			}
		}while(a != number);
		System.out.println("You're right, guess totally " + count + " time(s).");
	}

}
