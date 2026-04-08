package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("Funcionário");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salários: ");
        if (this.salarios != null){
            for(double salario : this.salarios){
                System.out.print(salario + " ");
            }
        }
        System.out.println();
        mediaSalarios();
    }

    public void mediaSalarios(){
        double media = 0;
        if (this.salarios != null){
            for(double salario : salarios){
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("Média salarial: " + media);
    }
}
