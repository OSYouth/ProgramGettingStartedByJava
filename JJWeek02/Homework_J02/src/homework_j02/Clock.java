package homework_j02;

public class Clock {
	
	private Display hou = new Display(24);
	private Display min = new Display(60);
	private Display sec = new Display(60);
	
	// ��hour, minute��second��ʼ��ʱ�䡣
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
	//  ����ડ�һ�£�ʱ����1�롣
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
	// ����һ��String��ֵ���ԡ�hh:mm:ss������ʽ��ʾ��ǰʱ�䡣
	//����ÿ����ֵ��ռ����λ��������λʱ��0���硰00:01:22"��
	//ע�����е�ð�������ĵģ��������ĵġ�
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hou.getValue(), min.getValue(), sec.getValue());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
