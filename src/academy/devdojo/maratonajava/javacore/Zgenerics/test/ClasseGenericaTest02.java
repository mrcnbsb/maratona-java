package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentalService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentalService barcoRentalService = new BarcoRentalService();
        Barco barco = barcoRentalService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentalService.retornarBarcoAlugado(barco);
    }
}

