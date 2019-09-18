import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int signal = in.nextInt();
		int r = (int)(signal/10);
		int s = (int)(signal%10);
		switch(s){
		case 1:
			System.out.print("Faint signals, barely perceptible, ");
			break;
		case 2:
			System.out.print("Very weak signals, ");
			break;
		case 3:
			System.out.print("Weak signals, ");
			break;
		case 4:
			System.out.print("Fair signals, ");
			break;
		case 5:
			System.out.print("Fairly good signals, ");
			break;
		case 6:
			System.out.print("Good signals, ");
			break;
		case 7:
			System.out.print("Moderately strong signals, ");
			break;
		case 8:
			System.out.print("Strong signals, ");
			break;
		case 9:
			System.out.print("Extremely strong signals, ");
			break;
		}
		switch(r){
		case 1:
			System.out.println("Unreadable.".toLowerCase());
			break;
		case 2:
			System.out.println("Barely readable, occasional words distinguishable.".toLowerCase());
			break;
		case 3:
			System.out.println("Readable with considerable difficulty.".toLowerCase());
			break;
		case 4:
			System.out.println("Readable with practically no difficulty.".toLowerCase());
			break;
		case 5:
			System.out.println("Perfectly readable.".toLowerCase());
			break;
		}

	}

}
