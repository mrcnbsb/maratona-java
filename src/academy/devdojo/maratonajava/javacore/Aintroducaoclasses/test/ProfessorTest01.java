package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.sexo = 'M';
        professor.idade = 140;

        System.out.println("Nome: " + professor.nome + ", sexo: " + professor.sexo + ", idade: " + professor.idade);
    }
}
