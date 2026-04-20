package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        //String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern = "'Brasília-DF, 'dd 'de' MMMM 'de' yyyy G 'às' HH:mm:ss 'do' z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
