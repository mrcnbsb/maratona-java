package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // Estruturas de Repetição
        // while, do while, for

        int count = 0;

        while(count < 10){
            System.out.println("while: " + count++);
        }

        do{
            System.out.println("do while: " + count--);
        } while (count > 0);

        for(int i = 0; i < 10; i++){
            System.out.println("for: " + i);
        }
    }
}
