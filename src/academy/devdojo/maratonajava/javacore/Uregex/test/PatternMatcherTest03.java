package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // expressões regulares
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Todos os espaços em branco \t \n \f r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // [] = range, tudo que estiver dentro dos [abcABC], [a-zA-C]
        String regex = "[a-zA-C]";
        String texto = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }

        //números hexadecimais precisam começar com 0x
        int numeroHex = 0x59F86A; //5.896.298
        System.out.println("numeroHex: " + numeroHex);

        //exercício
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        String regex2 = "0[xX][0-9a-fA-F]";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex2);
        System.out.println("Posicoes encontradas");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " " + matcher2.group()+"\n");
        }

    }
}
