package onclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {
//	private ArrayList<CD> list_CD = new ArrayList<CD>(); 
//	private ArrayList<DVD> list_DVD = new ArrayList<DVD>();
	private ArrayList<Item> list_item = new ArrayList<>();
	
//	public void add(CD cd){
//		list_CD.add(cd);
//	}
//	
//	public void add(DVD dvd){
//		list_DVD.add(dvd);
//	}
	public void add( Item item ){
		list_item.add(item);
	}
	
	public void list(){
//		for( CD cd : list_CD )
//		{
//			cd.print();
//		}
//		for( DVD dvd : list_DVD )
//		{
//			dvd.print();
//		}
		for( Item item : list_item ){
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Database db = new Database();
		db.add(new CD( "abc", "abc", 4, 60, "..."));
		db.add(new CD( "def", "def", 4, 60, "..."));
		db.add(new DVD( "xxx", "aaa", 60, "..."));
		

//		Item mp3 = new MP3( in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), in.nextLine());
//		db.add(mp3);

		db.add(new MP3( "That's Why (You Go Away) (1999 Digital Remaster)", "Michael Learns To Rock", "Greatest Hits", 5, "终有那么一首曲会让人想起一个人，是我一辈子的牵挂，10年了，今天听到仍然会泪下，告诉我这首歌曲后不久，他去了海外奋斗，如今虽然有了点成绩，但很艰辛，一直让我心疼，祝他一切的一切安顺！我想把我的思念都放进这首歌曲中。"));
		db.list();

	}

}
