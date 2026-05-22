package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        //comparable ou comparator
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("E", "Letra E");
        map.put("D", "Letra D");
        map.put("C", "Letra C");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue()); //ordena pela chave
        }

//        System.out.println(map.headMap("C")); //todo mundo antes do C
//        System.out.println(map.headMap("C").remove("A"));
//        System.out.println(map.headMap("C", true));
        System.out.println(map.higherKey("C"));

    }
}
