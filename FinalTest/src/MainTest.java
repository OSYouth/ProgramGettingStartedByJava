import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				int r = row+i;
				int c = col+j;
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
					list.add(al[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int rowLength = in.nextInt();
		int colLength = in.nextInt();
		int result = 0;	//���ϸ�������
		int temp = 0;	//���ڴ洢��ϸ������Ľ��
		boolean[][] aliveNow = new boolean[rowLength][colLength];
		boolean[][] deathNow = new boolean[rowLength][colLength];
		while( true )
		{
			int aliveRow = in.nextInt();
			int aliveClo = in.nextInt();
			if( aliveRow==-1 && aliveClo==-1 )
			{
				break;
			}
			else
			{
				result++;
				aliveNow[aliveRow][aliveClo] = true;
				deathNow[aliveRow][aliveClo] = true;
			}
		}
		int step = in.nextInt();
		while( step>0 )
		{
			for( int i=0; i<rowLength; i++){
				for( int j=0; j<colLength; j++){
					int numOfLive = 3;
					//�����ھӶ��еĺ���
					//�ж��ھӶ���Ȼ��ֵ
					if ( aliveNow[i][j] ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							result --;
						}
					} else if ( numOfLive == 3 ) {
						result++;
					}
				}
			}
			for( int i=0; i<rowLength; i++){
				for( int j=0; j<colLength; j++){
					int numOfLive = 0;
					//�����ھӶ��еĺ���
					//�ж��ھӶ���Ȼ��ֵ
					if ( !deathNow[i][j] && numOfLive == 3 ) {
						temp++;
					}
				}
			}
			step --;
		}
		result += temp;
		System.out.println(result);
	}

}
