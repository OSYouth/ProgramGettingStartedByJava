package onclass;

public class CD extends Item{
//	private String title;
	private String artist;
	private int num_of_tracks;
//	private int playing_time;
//	private boolean got_it = false;
//	private String comment;

	public CD(String title, String artist, int num_of_tracks, int playing_time, String comment) {
//		super();
		super( title, playing_time, false, comment);
//		this.title = title;
		this.artist = artist;
		this.num_of_tracks = num_of_tracks;
//		this.playing_time = playing_time;
//		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD( "a", "b", 2, 2, "...");
		cd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print( "CD:" );
		super.print();
		System.out.println( ":" + artist);	
	}
}
