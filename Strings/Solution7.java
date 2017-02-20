import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
          
          try{
              Pattern.compile(pattern);
              System.out.println("Valid");
          }
          catch(Exception e){
              System.out.println("Invalid");
          }
              
             /*char[] ar=pattern.toCharArray();
             int len=pattern.length();
          int i,count=0;
          for(i=0;i<len;i++)
          switch(ar[i])
              {
              case '(':
              count++;
              break;
              
              case ')':
              count--;
              break;
              
              case '[':
              count++;
              break;
              
              case ']':
              count--;
              break;
              
              case '{':
              count++;
              break;
              
              case '}':
              count--;
              break;
              
              default:
              break;
              
          }
          if(count==0)
              {
              System.out.println("Valid");
          }
          else
              {
              System.out.println("Invalid");
          }*/
          testCases--;
      }
   }
}
