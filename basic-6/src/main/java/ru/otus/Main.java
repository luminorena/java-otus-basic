package ru.otus;

public class Main {
    public static void main(String[] args) {
        FoodPacket foodPacket = new FoodPacket(20);
        Plate plate = new Plate(80);

        Cat[] cats = {
                new Cat("Люся", 20),
                new Cat("Боня", 20),
                new Cat("Барсик", 20),
                new Cat("Снежок", 20),
                new Cat("Мурка", 20),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("текущее кол-во еды " + plate.getCurrentFoodCount());
        }

        plate.addFood(foodPacket);

    }
}
