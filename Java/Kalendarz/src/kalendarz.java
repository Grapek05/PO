import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

public class kalendarz {
    public static void main(String[] args) {

        System.out.println(new Date().toString());
        Date dur = new Date();
        System.out.println(dur);
        Calendar cdur = Calendar.getInstance();
//        cal.setTime(dur);
        System.out.println(cdur.getTime());
        cdur.set(2025, 10, 8);
        System.out.println(cdur.getTime());
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(dur));
        DateTimeFormatter drf = new DateTimeFormatter.ofPattern("dd-MM");
        System.out.println(dtf.format(cdur.getTime));
    }
}
