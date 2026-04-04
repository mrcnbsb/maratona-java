package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //aritméticos
        // + - * /
        int num1 = 10;
        int num2 = 20;

        //sout+Tab
        System.out.println(num2 - num1); // + adição
        System.out.println(num2 + num1); // - subtração
        System.out.println(num2 * num1); // * multiplicação
        System.out.println(num2 / num1); // / divisão
        System.out.println(num1 + num2 + "valor " + num2 + num1); // + concatecação

        double resultado = num1 / num2;
        System.out.println(resultado);

        // % operador resto
        int resto = 20 % 3;
        System.out.println(resto);

        // operadores lógicos
        // < <= > >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezDiferenteVinte: " + isDezDiferenteVinte);

    }
}
