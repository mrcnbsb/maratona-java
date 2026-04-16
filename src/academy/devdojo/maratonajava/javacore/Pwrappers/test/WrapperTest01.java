package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytep = 1;
        short shortp = 1;
        int intp = 1; // autoboxing ou boxing
        long longp = 10L;
        float floatp = 10F;
        double doublep = 10D;
        char charp = 'M';
        boolean boolp = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'M';
        Boolean boolW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");
        System.out.println(verdadeiro);

        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.toUpperCase('a'));

    }
}
