package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Ford";
        carro1.ano = 2021;
        carro1.nome = "Cobalt";
        System.out.println("Modelo: " + carro1.modelo +  ", ano: " + carro1.ano + ", nome: " + carro1.nome);

        Carro  carro2 = new Carro();
        carro2.modelo = "BYD";
        carro2.ano = 2026;
        carro2.nome = "Dolphin";
        System.out.println("Modelo: " + carro2.modelo + ", ano: " + carro2.ano + ", nome: " + carro2.nome);

        System.out.println("----------");
        carro2 = carro1;
        Carro carro3 = carro1;

        System.out.println("Modelo: " + carro1.modelo +  ", ano: " + carro1.ano + ", nome: " + carro1.nome);
        System.out.println("Modelo: " + carro2.modelo + ", ano: " + carro2.ano + ", nome: " + carro2.nome);
        System.out.println("Modelo: " + carro3.modelo + ", ano: " + carro3.ano + ", nome: " + carro3.nome);
    }
}
