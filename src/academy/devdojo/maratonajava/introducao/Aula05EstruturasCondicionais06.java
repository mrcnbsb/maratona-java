package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 13;

        // switch => char, int, byte, short, enum, String
        switch(dia){
            case 1:
                System.out.println("FDS");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("FDS");
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (dia == 1 || dia == 7){
            System.out.println("FDS");
        } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia ==6 ){
            System.out.println("Dia útil");
        } else{
            System.out.println("Opção Inválida");
        }


        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }
}
