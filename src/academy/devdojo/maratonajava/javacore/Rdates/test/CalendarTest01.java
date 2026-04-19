package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // sistemas legados
        Calendar cal = Calendar.getInstance();
        if(cal.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        cal.add(Calendar.DAY_OF_MONTH, 2);
        cal.add(Calendar.HOUR, 2);
        Date date = cal.getTime();
        System.out.println(date);
    }
}
