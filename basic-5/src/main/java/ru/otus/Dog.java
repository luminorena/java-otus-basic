package ru.otus;

public class Dog extends Animal {

    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, endurance);
        this.swimSpeed = swimSpeed;
    }


    @Override
    public double swim(int distance) {
        int currentEndurance = getEndurance() - 2 * distance;
        System.out.println("swim: текущая выносливость животного " + getName() + ": " + currentEndurance);
        if (currentEndurance <= 0) {
            return -1;
        } else
            return (double) distance / getRunSpeed();
    }

}
