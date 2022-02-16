package application;

import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

import static java.util.Calendar.HOUR_OF_DAY;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //cal.add(Calendar.HOUR_OF_DAY, 4);
        //d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(Calendar.MONTH) + 1;

        //System.out.println(sdf.format(d));
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}
