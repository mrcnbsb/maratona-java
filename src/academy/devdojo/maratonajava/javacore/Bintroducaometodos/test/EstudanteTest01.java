package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora =  new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.sexo = 'M';
        estudante01.idade = 15;

        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';
        estudante02.idade = 16;

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);

        System.out.println("##########");
        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
