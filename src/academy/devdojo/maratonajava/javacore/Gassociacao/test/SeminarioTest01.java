package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Brasília");
        Aluno aluno1 = new Aluno("Marcone", 46);
        Professor professor1 = new Professor("Pedro", "Psicologia");
        Seminario seminario1 = new Seminario("Primeira Infância", local, new Aluno[]{aluno1});
        professor1.setSeminarios(new Seminario[]{seminario1});
        professor1.imprime();
    }
}
