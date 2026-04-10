package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 3", "0123456789");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu", "12345678989", endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Marcone", "111.111-111-11", endereco, 18000.0);
        funcionario.imprime();
    }
}
