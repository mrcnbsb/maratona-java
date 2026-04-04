package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kirito";
        String endereco = "Av João das Galileias";
        double salario = 5432.10;
        String dataRecebimentoSalario = "04/04/2026";

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo " +
            " que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);

    }
}
