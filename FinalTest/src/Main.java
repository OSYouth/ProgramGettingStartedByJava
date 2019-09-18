import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		int result = 0;
		Field field = new Field(row,col);
//		boolean[][] field = new boolean[row][col];
//		boolean[][] aliveNow = new boolean[row][col];
//		boolean[][] deathNow = new boolean[row][col];
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
				field.place(aliveRow, aliveClo, new Cell());
				result++;
//				aliveNow[aliveRow][aliveClo] = true;
//				deathNow[aliveRow][aliveClo] = true;
			}
		}
		
		int step = in.nextInt();
		for ( int i=0; i<step; i++ ) {
			for ( int r = 0; r<field.getHeight(); r++ ) {
				for ( int c = 0; c<field.getWidth(); c++ ) {
					Cell cell = field.get(r, c);
					Cell[] neighbour = field.getNeighbour(r, c);
					int numOfLive = 0;
					for ( Cell k : neighbour ) {
						if ( k.isAlive() ) {
							numOfLive++;
						}
					}
//					System.out.print("["+row+"]["+col+"]:");
//					System.out.print(cell.isAlive()?"live":"dead");
//					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							result --;
//							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) {
						cell.reborn();
						result++;
//						System.out.print("reborn");
					}
//					System.out.println();
				}
			}
//			System.out.println("UPDATE");
		}
		System.out.println(result);
	}
}


class Field {
	private int width;
	private int height;
	private Cell[][] field;
	
	public Field(int width, int height) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public Cell place(int row, int col, Cell o) {
		Cell ret = field[row][col];
		field[row][col] = o;
		return ret;
	}
	
	public Cell get(int row, int col) {
		return field[row][col];
	}
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				int r = row+i;
				int c = col+j;
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
	
	public void clear() {
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}
}

class Cell {
	private boolean alive = false;
	
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	
}

