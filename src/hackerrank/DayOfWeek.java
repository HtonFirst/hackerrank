package hackerrank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DayOfWeek {

    public static String findDay(int month, int day, int year) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        System.out.println(Calendar.DATE);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        int dayOfWeek = calendar.DAY_OF_WEEK;
        System.out.println(dayOfWeek);

        StringBuilder stringDay = new StringBuilder();
        switch(dayOfWeek) {
            case 1:
                stringDay.append("SUNDAY");
                break;
            case 2:
                stringDay.append("MONDAY");
                break;
            case 3:
                stringDay.append("TUESDAY");
                break;
            case 4:
                stringDay.append("WEDNESDAY");
                break;
            case 5:
                stringDay.append("THURSDAY");
                break;
            case 6:
                stringDay.append("FRIDAY");
                break;
            case 7:
                stringDay.append("SATURDAY");
                break;
        }

        return stringDay.toString();

//        String inputDateStr = String.format("%s/%s/%s", day, month, year);
//        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(inputDate);
//        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
//        return dayOfWeek;
    }

    public static void main(String[] args) throws ParseException {


        String s = findDay(8, 5, 2015);
        NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println(s);



    }
}

