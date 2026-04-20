package academy.devdojo.maratonajava.javacore.Rdates.test;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //System.out.println(localDateTime.getDayOfMonth());
        //System.out.println(localDateTime.getDayOfYear());
        //LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalDate date = LocalDate.parse("2022-08-06");
        System.out.println(date);
        //LocalTime time = LocalTime.of(9, 45, 21);
        LocalTime time = LocalTime.parse("09:45:21");
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time); // juntando date e time
        System.out.println(ldt1);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}
