package w6_02;

import java.util.Scanner;

public class Main {
      
    public static boolean isValid(String s)
    {
        int start = s.indexOf("$");
        int end   = s.indexOf("*");
        int xor = s.charAt(start+1) & 0XFFFF;
        for(int i = start+2; i < end; i++)
        {
            xor = xor^s.charAt(i);
        }
        xor = xor%65536;
        return xor == Integer.parseInt(s.substring(end+1), 16);
    }
          
    public static String getField(String s, int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(s.indexOf(",") != -1)
            {
                s = s.substring(s.indexOf(",")+1);
            }
        }
         
        if(s.indexOf(",") != -1)
        {
            return s.substring(0, s.indexOf(","));
        }
        else
        {
            return s;
        }
    }
            
    public static boolean isLocated(String s)
    {
        return Main.getField(s, 2).equals("A");
    }
         
    public static String getTime(String field)
    {
        String res = "";
        int hh = (Integer.parseInt(field.substring(0,2))+8)%24;
        String mm = field.substring(2, 4);
        String ss = field.substring(4, 6);
        if(hh < 10)
        {
            res += "0" + hh + ":" + mm + ":" + ss;
        }
        else
        {
            res += hh + ":" + mm + ":" + ss;
        }
        return res;
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gpsdata = "";
        String time = "";
         
        String tmp = in.nextLine();
        while(tmp.equals("END") == false)
        {
            if( tmp.substring(0, 6).equals("$GPRMC") && Main.isValid(tmp) && Main.isLocated(tmp) )
            {
                gpsdata = tmp;
            }
            tmp = in.nextLine();
        }
         
        time = Main.getTime(Main.getField(gpsdata, 1));
        System.out.println(time);
    }
}