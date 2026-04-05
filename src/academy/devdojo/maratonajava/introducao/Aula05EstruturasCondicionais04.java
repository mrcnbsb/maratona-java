package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario;
        double impostoDeRenda;

        salario = 16000 * 13 / 6;

        if (salario <= 34712){
            impostoDeRenda = salario * 0.097;
        } else if (salario <= 68507){
            impostoDeRenda = salario * 0.3735;
        } else{
            impostoDeRenda = salario * 0.495;
        }

        System.out.println(impostoDeRenda);


    }
}
