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

        // operadores lógicos
        // &&(and) ||(or) !(not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS5 = 5000F;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("isPS5Compravel: " + isPS5Compravel);

        // operadores de atribuição
        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println("bonus: " + bonus);
        bonus += 1000;
        System.out.println("bonus: " + bonus);
        bonus -= 1000;
        System.out.println("bonus: " + bonus);
        bonus *= 3;
        System.out.println("bonus: " + bonus);
        bonus /= 2;
        System.out.println("bonus: " + bonus);
        bonus %= 9;
        System.out.println("bonus: " + bonus);

        // contador
        int contador = 0;
        System.out.println("contador: " + contador);
        contador += 1; // contador = contador + 1;
        System.out.println("contador: " + contador);
        contador++; // contador = contador + 1;
        System.out.println("contador: " + contador);
        contador--;
        System.out.println("contador: " + contador);
        ++contador;
        System.out.println("contador: " + contador);
        --contador;
        System.out.println("contador: " + contador); // exibe o valor da variável

        System.out.println("contador: " + contador++); // exibe o valor primeiro e incrementa depois
        System.out.println("contador: " + contador);
        System.out.println("contador: " + ++contador); // incrementa primeiro e exibe o valor da variável incrementada depois


    }
}
