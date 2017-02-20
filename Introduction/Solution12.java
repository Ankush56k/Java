import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"SUNDAY");
        hm.put(2,"MONDAY");
        hm.put(3,"TUESDAY");
        hm.put(4,"WEDNESDAY");
        hm.put(5,"THURSDAY");
        hm.put(6,"FRIDAY");
        hm.put(7,"SATURDAY");
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        String format = year + "/" + month + "/" + day;
        Date date = null;
        try
            {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            date = formatter.parse(format);
        }
        catch(Exception e)
            {
            
        }
        
        
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(hm.get(dayOfWeek));
    }
}
