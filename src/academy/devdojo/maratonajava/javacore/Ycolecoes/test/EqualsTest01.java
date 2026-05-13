package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "William Suane";
//        String nome2 = "William Suane"; //pool de string
//        String nome3 = new String("William Suane"); //
//        System.out.println(nome == nome2);// true
//        System.out.println(nome == nome3);// false -> referências diferentes
//        System.out.println(nome.equals(nome2)); //true -> mesmo conteúdo

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");

//        //equals da classe object
//        System.out.println(s1.equals(s2)); // false -> objetos diferentes

//        s2 = s1;
//        System.out.println(s1.equals(s2)); // true -> mesmo objeto

//        //equals da classe Smartphone
//        System.out.println(s1.equals(s2)); // true -> serialNumber iguais

        //hashCode
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}
