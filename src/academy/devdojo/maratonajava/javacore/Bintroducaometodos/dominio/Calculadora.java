package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicarDoisNumeros(int num1, float num2){
        System.out.println(num1*num2);
    }

    public double dividirDoisNumeros(double num1, double num2){
        if(num2==0){
            return 0;
        }
        return num1/num2;
    }


    public double dividirDoisNumeros2(double num1, double num2){
        if(num2 != 0){
            return num1/num2;
        }
        return 0;
    }

    public void imprimirDividirDeDoisNumeros(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alterarDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        System.out.println("Soma: " + soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        System.out.println("Soma: " + soma);
    }


}
