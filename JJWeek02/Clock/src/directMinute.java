
public class directMinute {
	private int value = 0;
	private int limit = 0;
	private int hour = 0;
	
	public directMinute(int limit){
		this.limit = limit;
	}
	
	public void increase()
	{
		value ++;
		if( value==limit)
		{
			value = 0;
			hour ++;
			if( hour==24)
			{
				hour = 0;
			}
		}
	}
	
	public int getHour() {
		return hour;		
	}
	public int getValue() {
		return value;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		directMinute d = new directMinute(60);
		while(true)
		{
			d.increase();
			System.out.printf("%02d:%02d\n", d.getHour(), d.getValue());
		}

	}

}
