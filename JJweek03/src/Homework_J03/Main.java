/*
 * ���������ѡ�������һ����������ִӶ��õ����ĳ��ȺͿ�ȣ�����ArrayList�����̣��տ�ʼ��Ϊ����ArrayList����Ϥ�������˺ܾã���ȶ��Ա�����HashMapֻ��������ʮ�д��룬Ч�ʲ���
 * 
 * 
 * 1������̣�10�֣�
��Ŀ���ݣ�
��ͼΪ������Ҫ����֮��Ĺ�·��̣�
��ĳ���Ҫ����������һ�ű�Ȼ�󣬸���������������е����ƣ���������������֮�����̡�
ע�⣺�κ���������֮�����̶��Ѿ�����������Ҫ���㾭��������ת��
�����ʽ:
���ȣ����������ɸ����е����֡�ÿ�����ֶ�ֻ��һ��Ӣ�ĵ��ʣ��м䲻���ո���������š�����������Ϊ��###��������#�ţ�ʱ����ʾ�����������������###������һ�����е����֡�����Ƕ����ĳ������ֵ�����Ϊn��
Ȼ��������nxn��һ���������󡣵�һ�е�ÿһ�����֣���ʾ�������������е�һ���������ε���һ������֮�����̡�����ͬһ������֮������Ϊ0��
����������������е����֡�
�����ʽ��
�������������֮��ľ��롣
����������
Hagzou    Hugzou    Jigxng    ###
0       1108         708
1108         0       994
708  994  0
Hagzou    Jigxng
���������
708
 */
//    import java.util.Scanner;  
//    import java.util.HashMap;  
//      
//    public class Main {  
//      
//        public static void main(String agrs[]){  
//            HashMap<String,Integer> map = new HashMap<String,Integer>();  
//            Scanner in = new Scanner(System.in);  
//            int cnt = 0;  
//            while(true){  
//                String s = in.next();  
//                if(s.equals("###")){  
//                    break;  
//                }else{  
//                    map.put(s, ++cnt);  
//                }  
//            }  
//            int[][] arr = new int[cnt][cnt];  
//            for(int i = 0; i<cnt; i++){  
//                for(int j = 0;j<cnt;j++){  
//                    arr[i][j] = in.nextInt();  
//                }  
//            }  
//            String s1 = in.next();  
//            String s2 = in.next();  
//            int a = map.get(s1);  
//            int b = map.get(s2);  
//            System.out.println(arr[a-1][b-1]);  
//        }  
//          
//          
//    }  

package Homework_J03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private ArrayList<String> table = new ArrayList<String>();
//	private int[][] dis_table = new int[table.size()][table.size()];
	
	public void cityName(String s){
		table.add(s);
	}
	
	public int getSize(){
		return table.size();
	}
	
//	public void createTable(int distance){
//		for(int i=0; i<table.size(); i++)
//		{
//			for(int j=0; j<table.size(); j++)
//			{
//				dis_table[i][j] = distance;
//			}
//		}
//	}
	
	public int locat(String a){
		int location = 0;
		for(int i=0; i<table.size(); i++)
		{
//			System.out.println(table.get(i));
			if( a.equals(table.get(i)))
			{
				location = i;
				break;
			}
		}
		return location;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main list = new Main();
		Scanner in = new Scanner(System.in);
		while(true)
		{
			String s = in.next();
//			System.out.println(s);
			if(s.equals("###"))
			{
				break;
			}
			else
			{
				list.cityName(s);
			}
		}
		
//		while( in.next()!="###")
//		{
//			System.out.println(in.nextLine());
//			list.cityName(in.nextLine());
//		}
//		list.createTable(in.nextInt());
		
		int[][] dis = new int[list.getSize()][list.getSize()];

		for(int i=0; i<list.getSize(); i++)
		{
			for(int j=0; j<list.getSize(); j++)
			{
				dis[i][j] = in.nextInt();
			}
		}
		
//		for(int i=0; i<list.getSize(); i++)
//		{
//			for(int j=0; j<list.getSize(); j++)
//			{
//				System.out.print(dis[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		String begin_city = in.next();
		String end_city = in.next();
//		System.out.print(begin_city+" "+end_city);
		int bc = list.locat(begin_city);
		int ec = list.locat(end_city);
//		System.out.print(bc+" "+ec);
		System.out.println(dis[bc][ec]);
	}

}
