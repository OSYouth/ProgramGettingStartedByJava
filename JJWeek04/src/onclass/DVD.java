package onclass;

public class DVD extends Item{
	private String director;
	
	public DVD(String title, String director, int playing_time, String comment) {
		super(title, playing_time, false, comment);
//		this.title = title;
		this.director = director;
//		this.playing_time = playing_time;
//		this.comment = comment;
	}

	@Override
	public String toString() {
		return "DVD [director=" + director + ", toString()=" + super.toString() + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		DVD cc = (DVD)obj;
		return director.equals(cc.director);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD( "a", "b", 1, "...");
		DVD dvd1 = new DVD( "a", "b", 1, "...");
		dvd.print();
		System.out.println(dvd.toString());
		System.out.println(dvd.equals(dvd1));
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print( "DVD:" );
		super.print();
		System.out.println( ":" + director);	
	}
}
