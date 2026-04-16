package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Luffy ";
        String numeros ="012345";
        System.out.println(nome.charAt(0)); // caracter pelo índice, início em zero
        System.out.println(nome.length()); // método, retorna o tamanho
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(0, 3));
        System.out.println(numeros.substring(1, 3));
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(numeros.substring(3)); // do índice 3 até o final
        System.out.println(nome.trim()); // remove valor em branco no começo e no fim da string
    }
}
