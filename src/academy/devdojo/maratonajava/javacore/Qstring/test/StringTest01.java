package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        //Strings são imutáveis
        String nome = "Marcone"; //String constant pool
        String nome2 = "Marcone";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2); // comparar referências
        String nome3 = new String("Marcone"); // 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3); // retorna false pq fazem referência a lugares diferentes na memória
        System.out.println(nome2 == nome3.intern());
        System.out.println(nome3);
    }
}
