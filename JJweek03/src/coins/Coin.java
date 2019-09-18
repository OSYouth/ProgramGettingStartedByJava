package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {

	private HashMap<Integer, String> coinnames = new HashMap<>();
	
	public Coin(){
		coinnames.put(1, "penny");
		coinnames.put(10, "demo");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "ÎåÃ«");
		System.out.println(coinnames.keySet().size());
		System.out.println(coinnames);
		for( Integer k : coinnames.keySet() )
		{
			String s = coinnames.get(k);
			System.out.println(s);
		}
	}
	
	public String getName( int amount ){
		return coinnames.get(amount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);

	}

}
