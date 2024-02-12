package ru.otus;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Lusy", 3, 2);
        Dog dog = new Dog("Sharik", 1, 6, 3);
        Horse horse = new Horse("Zherebec", 2, 6, 1);
        cat.swim(2);
        cat.info("swim");
        System.out.println(cat.run(2));
        cat.info("run");
        System.out.println(dog.run(5));
        dog.info("run");
        System.out.println(dog.swim(1));
        dog.info("swim");
        System.out.println(horse.run(4));
        horse.info("run");
        System.out.println(horse.swim(5));
        horse.info("swim");

    }
}
