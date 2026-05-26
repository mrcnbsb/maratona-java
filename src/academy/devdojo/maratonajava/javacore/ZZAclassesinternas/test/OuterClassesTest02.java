package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

public class OuterClassesTest02 {
    private String name = "Midoriya";
    void print(){ // classes locais, dentro do método ou bloco de inicialização
        String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer =  new OuterClassesTest02();
        outer.print();
    }
}
