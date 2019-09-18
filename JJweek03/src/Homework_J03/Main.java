/*
 * 做这个题我选择的是用一个数组存名字从而得到表格的长度和宽度，再用ArrayList存放里程，刚开始因为对于ArrayList不熟悉，调试了很久，相比而言别人用HashMap只用了三四十行代码，效率不高
 * 
 * 
 * 1查找里程（10分）
题目内容：
下图为国内主要城市之间的公路里程：
你的程序要读入这样的一张表，然后，根据输入的两个城市的名称，给出这两个城市之间的里程。
注意：任何两个城市之间的里程都已经给出，不需要计算经第三地中转。
输入格式:
首先，你会读到若干个城市的名字。每个名字都只是一个英文单词，中间不含空格或其他符号。当读到名字为“###”（三个#号）时，表示城市名字输入结束，###并不是一个城市的名字。如果记读到的城市名字的数量为n。
然后，你会读到nxn的一个整数矩阵。第一行的每一个数字，表示上述城市名单中第一个城市依次到另一个城市之间的里程。表中同一个城市之间的里程为0。
最后，你会读到两个城市的名字。
输出格式：
输出这两个城市之间的距离。
输入样例：
Hagzou    Hugzou    Jigxng    ###
0       1108         708
1108         0       994
708  994  0
Hagzou    Jigxng
输出样例：
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
