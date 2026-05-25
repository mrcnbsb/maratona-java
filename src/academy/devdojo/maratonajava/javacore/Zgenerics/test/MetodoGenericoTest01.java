package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));
    }

    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}

//class DoisAtributos<T,X,I>{
//    private T t;
//    private X x;
//    private I i;
//
//    public DoisAtributos(T t, X x, I i) {
//        this.t = t;
//        this.x = x;
//        this.i = i;
//    }
//
//    public T getT() {
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }
//
//    public X getX() {
//        return x;
//    }
//
//    public void setX(X x) {
//        this.x = x;
//    }
//
//    public I getI() {
//        return i;
//    }
//
//    public void setI(I i) {
//        this.i = i;
//    }
//}
