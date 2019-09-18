//import java.io.*;
//import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int bjt, utc;
        bjt = in.nextInt();
        utc = bjt - 800;
        if(utc < 0){
        	utc = utc + 2400;
        }
        System.out.println(utc);

/*        while(cin.hasNextInt())
        {
            bjt = cin.nextInt();
            utc = bjt - 800;
            if(utc < 0){
            	utc = utc + 2400;
            }
            if(utc < 1000){
            	utc = utc;
            }
            System.out.println(utc);
        }
*/
    }
}