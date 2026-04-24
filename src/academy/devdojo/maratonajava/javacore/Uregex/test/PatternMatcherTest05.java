package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3
        //exercício: todos os emails válidos
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaron@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex));

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
