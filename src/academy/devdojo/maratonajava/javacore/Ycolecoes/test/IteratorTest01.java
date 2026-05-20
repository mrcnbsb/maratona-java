package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        System.out.println(mangas);
        System.out.println("----------");

        //não é uma boa ideia
//        for (Manga manga : mangas) {
//            if(manga.getQuantidade()==0){
//                mangas.remove(manga);
//            }
//        }

        //desatualizado
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while( mangaIterator.hasNext() ) {
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade()==0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade()==0);
        System.out.println(mangas);

    }
}
