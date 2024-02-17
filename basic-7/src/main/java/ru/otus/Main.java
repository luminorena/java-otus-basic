package ru.otus;


public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Заря", 10);
        Car car = new Car("Honda", 12);
        Bike bike = new Bike("Дружок");
        OffRider offRider = new OffRider("Sherp", 12);

        Human human = new Human("Ольга", car, 10);
        human.info();
        System.out.println(human.move(5, TerritoryType.PLAIN));


    }
}
