package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = now.plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
        System.out.println(p1.getDays());
        System.out.println(p1.getMonths());
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p3.getMonths());
        Period p4 = Period.ofMonths(3);
        System.out.println(p4);
        Period p5 = Period.ofYears(1);
        System.out.println(p5);

    }
}
