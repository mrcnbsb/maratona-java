package academy.devdojo.maratonajava.introducao;

public class Aula07arrays01 {
    public static void main(String[] args) {
        int idade1 = 15;
        int idade2 = 25;
        int idade3 = 35;
        System.out.println("Idade 1: " + idade1);
        System.out.println("Idade 2: " + idade2);
        System.out.println("Idade 3: " + idade3);

        int[] idades = new int[3];

        System.out.println(idades[0]); // = 0
        System.out.println(idades[1]); // = 0
        System.out.println(idades[2]); // = 0

        idades[0] = 15;
        idades[1] = 25;
        idades[2] = 35;

        System.out.println(idades[0]); // = 15
        System.out.println(idades[1]); // = 25
        System.out.println(idades[2]); // = 35
    }
}
