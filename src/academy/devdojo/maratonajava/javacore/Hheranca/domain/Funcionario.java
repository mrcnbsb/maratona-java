package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private Double salario;
    static{
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialição de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialição de funcionário 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do bloco de inicialização de funcionário");
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu, "+this.nome+", recebi o salário de R$"+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
