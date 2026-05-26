package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "William";
    static class Nested{
        private String lastname = "Suane";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastname);
        }
    }

    public static void main(String[] args) {
        new Nested().print();
    }
}
