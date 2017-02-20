import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        
        int value=sc.nextInt();
        
        int len=str.length();
        
        int parts=len-value+1;
        
        String[] string=new String[parts];
        
        String min,max;
        
        int i;
        for(i=0;i<parts;i++)
            {
            string[i]=str.substring(i,i+value);
        }
        min=string[0];
        max=string[0];
        for(i=1;i<parts;i++)
            {
        if((string[i].compareTo(min))<0)
            {
            min=string[i];
                        }
                if((string[i].compareTo(max))>0)
                {
                max=string[i];
                            }    
                         } 
   
        System.out.println(min);
        System.out.println(max);
    }
}