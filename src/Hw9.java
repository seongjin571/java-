import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

//import java.time.
public class Hw9 {
    public static void main(String []args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm");
        LocalDateTime time = LocalDateTime.now();
        String nowTime = time.format(formatter);
        System.out.println(nowTime);

        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.HOUR,10);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if (hour < 12 && hour > 4)
            System.out.println("Good Morning");
        else if (hour >= 12 && hour < 18)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}
