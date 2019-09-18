
public class Display {
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit){
		this.limit = limit;
	}
	
	public void increase()
	{
		value ++;
		if( value==limit)
		{
			value = 0;
		}
	}
	
	public int getValue() {
		return value;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Display d = new Display(24);
//		while(true)
//		{
//			d.increase();
//			System.out.println(d.getValue());
//		}
		
		Display hour = new Display(24);
		Display minute = new Display(60);
		while(true)
		{
			minute.increase();
			if( minute.getValue()==0 )
			{
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
		}

	}

}
