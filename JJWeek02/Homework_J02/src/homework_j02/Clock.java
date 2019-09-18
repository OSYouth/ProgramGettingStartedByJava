package homework_j02;

public class Clock {
	
	private Display hou = new Display(24);
	private Display min = new Display(60);
	private Display sec = new Display(60);
	
	// 用hour, minute和second初始化时间。
	public Clock(int hour, int minute, int second)
	{
		int plus_minute = 0;
		int plus_hour = 0;

		if( second>=60 )
		{
			plus_minute = second/60;
			second = second%60;
		}
		sec.setValue(second);
		if( minute>=60 )
		{
			plus_hour = minute/60;
			minute = minute%60;
		}
		min.setValue((minute+plus_minute));
		if( hour>=24 )
		{
			hour = hour%24;
		}
		hou.setValue((hour+plus_hour));
		
	}
	//  “嘀嗒”一下，时间走1秒。
	public void tick()
	{
		sec.increase();
		boolean mark = true;
		if( min.getValue()==0 )
		{
			mark = false;
		}
		if( sec.getValue()==0 )
		{
			min.increase();
		}
		if( min.getValue()==0 && mark)
		{
			hou.increase();
		}
	}
	// 返回一个String的值，以“hh:mm:ss“的形式表示当前时间。
	//这里每个数值都占据两位，不足两位时补0。如“00:01:22"。
	//注意其中的冒号是西文的，不是中文的。
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hou.getValue(), min.getValue(), sec.getValue());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
