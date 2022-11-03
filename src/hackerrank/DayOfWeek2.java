package hackerrank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DayOfWeek2 {
    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);

        Date date= calendar.getTime();
        String finalDay = new SimpleDateFormat("EEEE", Locale.US).format(date);
        return finalDay.toUpperCase();

    }

    public static void main(String[] args) {

        System.out.println(DayOfWeek2.findDay(8, 5, 2015));

    }
}
