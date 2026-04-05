package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 5;
        if(dia == 1){
            System.out.println("Domingo");
        } else if(dia == 2){
            System.out.println("Segunda");
        }  else if(dia == 3){
            System.out.println("Terça");
        } else if(dia == 4){
            System.out.println("Quarta");
        }  else if(dia == 5){
            System.out.println("Quinta");
        }   else if(dia == 6){
            System.out.println("Sexta");
        } else{
            System.out.println("Sábado");
        }


        // switch => char, int, byte, short, enum, String
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        char sexo = 'F';
        switch(sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
