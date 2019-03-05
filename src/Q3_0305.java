import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.*;
import java.util.Scanner;

public class Q3_0305 {
    public static void main(String[]args){
        Calendar cal = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
        String wantTime = scan.nextLine();
        long time = cal.getTimeInMillis(wantTime);
        long today = System.currentTimeMillis();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.print(localDateTime.format(formatter));

//
//        Date conFromDate = new Date();
//        long ttl = conFromDate.parse ( "Dec 25, 1997 10:10:10" );
//        long today2 = localDateTime.parse("12-23");
//        System.out.print(today);
        SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        String strDate = "2014-01-29 13:30";
        Date date = dateFormat.parse(strDate);



    }
}
