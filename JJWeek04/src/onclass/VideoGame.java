package onclass;

public class VideoGame extends Item {
	private int numberOfPlayers;

	public VideoGame(String title, int playing_time, boolean got_it, String comment, int number) {
		super(title, playing_time, got_it, comment);
		numberOfPlayers = number;
		// TODO Auto-generated constructor stub
	}

	public void print(){
		System.out.print("VideoGames: ");
		super.print();
		System.out.println(": "+ numberOfPlayers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
