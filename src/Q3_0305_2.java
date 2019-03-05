
import java.util.*;

public class Q3_0305_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc= new Scanner(System.in);

        Calendar cal1=Calendar.getInstance();
        Calendar cal2=Calendar.getInstance();
        char[] d= {'일','월','화','수','목','금','토'};
        String string;

        System.out.print("날짜입력(1900-01-01)>>");

        string=sc.next();

        String[] day=string.split("-");
        int year1=Integer.parseInt(day[0]);
        int	month1=Integer.parseInt(day[1])-1;
        int date1=Integer.parseInt(day[2]);

        cal1.set(year1, month1, date1);

        if(cal1.getTimeInMillis()<=cal2.getTimeInMillis()) {
            long a=(cal2.getTimeInMillis()-cal1.getTimeInMillis())/1000;

            System.out.println("기준일은 "+d[cal1.get(Calendar.DAY_OF_WEEK)-1]+"요일 이며 오늘은 기준일부터 "+a/(24*60*60)+"일 지났습니다.");

        }
        else {
            long a=(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
            System.out.println("기준일은 "+d[cal1.get(Calendar.DAY_OF_WEEK)-1]+"요일 이며 오늘은 기준일부터 "+(a+1)/(24*60*60)+"일 남았습니다.");
        }

    }


}