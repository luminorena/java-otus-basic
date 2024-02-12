package ru.otus;

public class Horse extends Animal {

    public Horse(String name, int runSpeed, int endurance, int swimSpeed) {
        super(name, runSpeed,  endurance);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public double swim(int distance) {
        int currentEndurance = getEndurance() - 4 * distance;
        System.out.println("swim: текущая выносливость животного " + getName() + ": " + currentEndurance);
        if (currentEndurance <= 0) {
            return -1;
        } else
            return (double) distance / getRunSpeed();
    }
}
