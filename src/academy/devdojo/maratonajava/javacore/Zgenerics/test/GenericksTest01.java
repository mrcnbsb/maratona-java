package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericksTest01 {
    public static void main(String[] args) {
//        List lista = new ArrayList();
//        lista.add("Midoriya");
//        lista.add(123L);
//        lista.add(new Consumidor("Goku"));
//
//        for (Object o : lista) {
//            System.out.println(o);
//        }
//
//        for (Object o : lista) {
//            if(o instanceof String){
//                System.out.println(o);
//            }
//            if(o instanceof Long){
//                System.out.println(o);
//            }
//            if(o instanceof Consumidor){
//                System.out.println(o);
//            }
//        }

        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Consumidor("Midoriya"));

        for (String o : lista) {
            System.out.println(o);
        }


    }

    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
