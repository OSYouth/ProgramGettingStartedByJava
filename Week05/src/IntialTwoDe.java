import java.util.Scanner;

public class IntialTwoDe {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean got_result = false;
		int num_of_x = 0;
		int num_of_o = 0;
		
		//read the matrix
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}

	}

}
