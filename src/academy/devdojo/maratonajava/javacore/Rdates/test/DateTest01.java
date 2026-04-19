package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Date -> sistemas legados
        Date date =  new Date(); // long 1000000 desde 01/01/1970

        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);
    }
}
