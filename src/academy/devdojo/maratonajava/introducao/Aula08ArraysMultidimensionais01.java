package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1 2 3 4 .. mês
        // 31 28 31 30 .. dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 30;
        dias[2][2] = 31;

//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.println(dias[i][j]);
//            }
//        }

        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }

    }
}
