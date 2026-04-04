package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos
        // int, double, float, char, byte, short, long, boolean
        byte idadeByte = 46; //1 byte = 8 bits
        short idadeShort = 46; //2 bytes
        int idade = (int) 10000000000L; //4 bytes
        long numeroGrande = 100000; //8 bytes
        long numeroGrande2 = 100000L; //8 bytes
        float salarioFloat = 2500; //4 bytes
        float salarioFloat2 = 2500.0F; //4 bytes
        double salarioDouble = 2000.0; //8 bytes
        double salarioDouble2 = 2000.0D; //8 bytes
        boolean verdadeiro = true; //1 bit
        boolean falso = false; // 1 bit
        char caractere = '\u0041'; // 2 bytes // unicode ou asc

        // tipo referência
        String nome = "É um graaaaande texto";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("Oi, meu nome é " + nome);
    }
}
