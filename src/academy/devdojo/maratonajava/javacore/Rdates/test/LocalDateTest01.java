package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance().getTime());
        LocalDate localDate = LocalDate.now(); // somente data, desde v8 do Java
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(1990, 1, 1);
        System.out.println(localDate1);
        System.out.println(Month.JANUARY);
        System.out.println(Month.JANUARY.getValue());
        LocalDate localDate2 = LocalDate.of(2022, Month.JANUARY, 1);
        System.out.println(localDate2);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getMonth().getValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate);
        System.out.println(localDate.MAX);
        System.out.println(localDate.MIN);
    }
}
