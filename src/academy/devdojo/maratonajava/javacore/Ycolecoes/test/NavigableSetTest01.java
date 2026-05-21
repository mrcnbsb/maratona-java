package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarthphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getMarca().compareTo(s2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
//        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
