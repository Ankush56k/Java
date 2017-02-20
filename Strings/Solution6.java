import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
      
        StringTokenizer string = new StringTokenizer(s,("[_\\@!?.', ]"));
        int x = string.countTokens();
        System.out.println(x);
        while(string.hasMoreTokens())
        {
            System.out.println(string.nextToken());
        }
        scan.close();
    }
}
