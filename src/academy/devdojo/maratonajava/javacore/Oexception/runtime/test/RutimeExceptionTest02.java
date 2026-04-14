package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RutimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     * */
    private static int divisao(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
