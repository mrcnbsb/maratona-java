package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // expressões regulares
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Todos os espaços em branco \t \n \f r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // [] = range, tudo que estiver dentro dos [abcABC], [a-zA-C]
        //números hexadecimais precisam começar com 0x
        // quantificadores:
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // () agrupamento
        // | ou
        // $ fim da linha
        int numeroHex = 0x59F86A; //5.896.298
        System.out.println("numeroHex: " + numeroHex);

        //exercício
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }

    }
}
