package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // estruturas condicionais
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica.");
        }

        if(isAutorizadoComprarBebida == false){
            System.out.println("Não Autorizado a comprar bebida alcoolica.");
        }

        if(!isAutorizadoComprarBebida){ // operador negação
            System.out.println("Não Autorizado a comprar bebida alcoolica.");
        }

        System.out.println("Fora do if");

        // if else
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica.");
        } else{
            System.out.println("Não Autorizado a comprar bebida alcoolica.");
        }



    }
}
