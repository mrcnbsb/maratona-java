package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


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
