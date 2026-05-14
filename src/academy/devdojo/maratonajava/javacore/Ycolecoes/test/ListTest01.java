package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); //1.5
        nomes.add("William");
        nomes.add("DevDojo");
        List<String> nomes2 = new ArrayList<>(16);
        nomes2.add("Suane");
        nomes2.add("Academy");
//        nomes.add(121);
//        nomes.remove(1); //index
//        nomes.remove("Marcone"); //objeto
//        System.out.println(nomes.remove("Marcone")); //retorna true ou false caso consiga remover ou não

        //adiciona todos os elementos de nomes2 em nome
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }


//        nomes.add("Suane");
        System.out.println("----------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
