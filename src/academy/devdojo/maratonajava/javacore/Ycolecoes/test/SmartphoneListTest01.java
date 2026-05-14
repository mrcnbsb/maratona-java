package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1); //add no final
        smartphones.add(s2); //add no final
        smartphones.add(0, s3); //add no index informado

//        smartphones.clear(); // limpa o arrayList

        Smartphone s4 = new Smartphone("22222", "Pixel");
//        boolean contains = smartphones.contains(s4); //usa o equals
//        System.out.println(contains);

//        int indexSmartphone4 = smartphones.indexOf(s4);
//        System.out.println(indexSmartphone4);

//        smartphones.add(s4); //adiciona no final
//        smartphones.add(0, s4); //adicionao no index informado

//        Smartphone s5 = new Smartphone("22333", "Samsung");
//        boolean containsS5 = smartphones.contains(s5);
//        System.out.println(containsS5);
//        int indexS5 = smartphones.indexOf(s5);
//        System.out.println(indexS5); //se não encontrar retorna -1

        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println("s4: "+smartphones.get(indexSmartphone4));


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

    }
}
