package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        byte idadeByte = 46; //1 byte = 8 bits
        short idadeShort = 46; //2 bytes
        int age = 46; //4 bytes
        long numeroGrande = 100000; //8 bytes
        float salarioFloat = 2500; //4 bytes
        double salarioDouble = 2000; //8 bytes
        boolean verdadeiro = true; //1 bit
        boolean falso = false; // 1 bit
        char caractere = '\u0041'; // 2 bytes // unicode ou asc

        System.out.println("A idade é " + age + " anos");
        System.out.println(caractere);
    }
}
