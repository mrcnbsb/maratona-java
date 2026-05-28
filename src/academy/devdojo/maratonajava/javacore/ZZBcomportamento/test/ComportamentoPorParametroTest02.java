package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.Predicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new Predicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);

        List<Car> redCars = filter(cars, new Predicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("red");
            }
        });
        System.out.println(redCars);

        List<Car> byYearBefore = filter(cars, new Predicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2015;
            }
        });
        System.out.println(byYearBefore);
    }

    private static List<Car> filter(List<Car> cars, Predicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>(); //lista vazia
        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }






}
