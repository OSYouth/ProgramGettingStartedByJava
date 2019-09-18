package homework_j02;

public class Display {

	private int value = 0;
	private int limit = 0;
	
	public Display(int limit){
		this.limit = limit;
	}
	
	public void setValue(int initial_value) {
		this.value = initial_value;		
//		if( value>limit )
//		{
//			value = value % limit;
//		}
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

	}

}
