package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of( //atributo de classe
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
//        System.out.println(filterGreenCar(cars));
//        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("------");
        System.out.println(filterCarByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carsColor = new ArrayList<>(); //lista vazia
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsColor.add(car);
            }
        }
        return carsColor;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> carsColor = new ArrayList<>(); //lista vazia
        for (Car car : cars) {
            if (car.getYear() < year) {
                carsColor.add(car);
            }
        }
        return carsColor;
    }

}
