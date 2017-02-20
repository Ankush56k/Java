import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
            int length,count,count1;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                length=s1.length();
                count=15-length;
                if(x<10)
                    {
                    count1=3;
                }
                else if(x<100)
                    {
                    count1=2;
                }
                else
                    {
                    count1=1;
                }
                
                System.out.print(s1);
                
                for(int j=0;j<count;j++)
                    {
                    System.out.print(" ");
                }
                
                for(int k=0;k<count1-1;k++)
                    {
                    System.out.print(0);
                }
                
                System.out.println(x);
                
            }
            System.out.println("================================");

    }
}
