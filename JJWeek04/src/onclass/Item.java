package onclass;

public class Item {
	private String title;
	private int playing_time;
	private boolean got_it = false;
	private String comment;
	
	public Item() {
		
	}

	public Item(String title, int playing_time, boolean got_it, String comment) {
		super();
		this.title = title;
		this.playing_time = playing_time;
		this.got_it = got_it;
		this.comment = comment;
	}

	public void print() {
		System.out.print(title);
	}

}
