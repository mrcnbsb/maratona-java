package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        for (String manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        System.out.println("----------");
        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);
        System.out.println("----------");
        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        System.out.println(dinheiros);
    }
}
