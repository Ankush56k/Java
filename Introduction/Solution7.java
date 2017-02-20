import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int t,count;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int[] al=new int[t];
        int[] bl=new int[t];
        int[] nl=new int[t];
        ArrayList array[]=new ArrayList[t];
        for(int i=0;i<t;i++)
            {
           al[i]=sc.nextInt();
           bl[i]=sc.nextInt();
           nl[i]=sc.nextInt();
            count=al[i];
            array[i]=new ArrayList();
            for(int j=0;j<nl[i];j++)
                {
              count+=Math.pow(2,j)*bl[i];
                array[i].add(count);
            } 
        }
        
        for(int i=0;i<t;i++)
            {
            for(int j=0;j<array[i].size();j++)
		{
            System.out.print(array[i].get(j)+" ");
        }
 
            System.out.println();
        
        
    }
}
}