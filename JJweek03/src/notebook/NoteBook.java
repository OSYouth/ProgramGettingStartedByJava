package notebook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;;

class Value{
	private int i;
	public void set(int i)
	{
		this.i = i;
	}
	public int get()
	{
		return i;
	}
//	public String toString()
//	{
//		return ""+i;
//	}
}

public class NoteBook {
	
	private ArrayList<String> notes = new ArrayList<String>();

	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int location){
		notes.add(location, s);
	}
	
	public int getSize(){
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i=0; i<notes.size(); i++)
//		{
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] ia = new int[10];
//		for( int i=0; i<ia.length; i++)
//		{
//			ia[i] = i;
//		}
//		for( int k : ia )
//		{
//			System.out.println(k);
//		}
		
		Value v = new Value();
		v.set(10);
		System.out.println(v);
		
		ArrayList<String> a = new ArrayList<>();
		a.add("first");
		a.add("second");
		a.add("first");
		for( String s : a)
		{
			System.out.println(s);
		}
		System.out.println(a);
		System.out.println("_____________");
		HashSet<String> s = new HashSet<>();
		s.add("first");
		s.add("second");
		s.add("first");
		for( String k : s )
		{
			System.out.println(k);
		}
		System.out.println(s);
		
//		Value[] a = new Value[10];
//		for( int i=0; i<a.length; i++)
//		{
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for( Value v : a)
//		{
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for( Value v: a )
//		{
//			System.out.println(v.get());
//		}
		
//		String[] a = new String[10];
//		for( int i=0; i<a.length; i++)
//		{
//			a[i] = ""+i;
//		}
//		
//		System.out.println(ia[0]+2);
//		System.out.println(a[0].length());
//		String s = null;
//		System.out.println(s.length());
		
//		NoteBook nb = new NoteBook();
//		nb.add("first");
//		nb.add("second");
//		nb.add("third", 1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		System.out.println(nb.getNote(1));
//		nb.removeNote(1);
//		String[] a = nb.list();
//		for(String s:a)
//		{
//			System.out.println(s);
//		}
	}

}
