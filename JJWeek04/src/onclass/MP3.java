package onclass;

public class MP3 extends Item{
	private String singer;
	private String album;
	
	public MP3(String title, String singer, String album, int playing_time, String comment ) {
		super( title, playing_time, false, comment);
		this.singer = singer;
		this.album = album;
	}

	
	public void print(){
		System.out.print("MP3: ");
		super.print();
		System.out.println(": "+ singer);
	}
}