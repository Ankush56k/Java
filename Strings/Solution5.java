import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
        int al=A.length();
        int bl=B.length();
       
       A=A.toLowerCase();
       B=B.toLowerCase();
       
       
        int i,j;
        char temp;
        
       char[] ar =A.toCharArray();
       char[] br =B.toCharArray(); 
         
      for(i=0;i<al;i++)
          {
          for(j=i;j<al;j++)
              {
          if(ar[i]>ar[j])
              {
              temp=ar[i];
              ar[i]=ar[j];
              ar[j]=temp;
          }
      }
      }
       
        for(i=0;i<bl;i++)
          {
          for(j=i;j<bl;j++)
              {
          if(br[i]>br[j])
              {
              temp=br[i];
              br[i]=br[j];
              br[j]=temp;
          }
      }
      }
       
       String C=new String(ar);
       String D=new String(br);
       
       if((C.equalsIgnoreCase(D)))
           {
           return true;
       }
       else
           {
           return false;
       }
       
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
