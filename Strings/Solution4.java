import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int len=A.length();
        
        String[] parts=new String[len];
        
        int a,i,count=0;
        
        for(i=0;i<len;i++)
            {
            parts[i]=A.substring(i,i+1);
        }
       
        if(len%2==0)
            a=0;
        else
            a=1;
        
        for(i=0;i<(len+a)/2;i++)
            {
            if(parts[i].equals(parts[len-i-1]))
                {
                count++;
            }
        }
        
        if(count==(a+len)/2)
            {
            System.out.println("Yes");
        }
        else
            {
            System.out.println("No");
        }
       
        
    }
}
