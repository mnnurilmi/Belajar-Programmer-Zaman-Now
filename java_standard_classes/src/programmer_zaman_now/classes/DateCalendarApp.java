package programmer_zaman_now.classes;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarApp {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2022);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH,26);

        Date res = calendar.getTime();
        System.out.println(res);
    }
}
