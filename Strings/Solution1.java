import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int al=A.length();
        int bl=B.length();
        int len=al+bl;
        
        char[] as=new char[al];
        char[] bs=new char[bl];
        
        for(int i=0;i<al;i++)
        {
        	as[i]=A.charAt(i);
        }
        
        for(int i=0;i<bl;i++)
        {	
        	bs[i]=B.charAt(i);
        }
        System.out.println(len);
  
        	if((A.compareTo(B))>0)
        	{
        		System.out.println("Yes");
        	}
        	else
            {
               
        		System.out.println("No");
        	}
        
        as[0]=Character.toUpperCase(as[0]);
        bs[0]=Character.toUpperCase(bs[0]);
        
        for(int i=0;i<al;i++)
        {
        	System.out.print(as[i]);
        }
        System.out.print(" ");
      
        for(int i=0;i<bl;i++)
        {	
        System.out.print(bs[i]);
        }
        
        
    }
}
