package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Marcone Miranda Amaral";
        nome.concat(" - DevDojo ");
        nome = nome.substring(0,3);
        System.out.println(nome); // Marcone Miranda Amaral

        StringBuilder sb = new StringBuilder("Marcone Miranda Amaral"); // não é imutável
        sb.append(" - DevDojo ").append(" - Academy");
        String substring = sb.substring(0,3);
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
