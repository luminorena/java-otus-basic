package ru.otus;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, endurance);
        this.swimSpeed = -1;
    }

    @Override
    public double swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }

}
