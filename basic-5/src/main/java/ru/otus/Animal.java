package ru.otus;

public abstract class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int endurance;
    private int state;


    public Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;

    }

    public String getName() {
        return name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }


    public int getEndurance() {
        return endurance;
    }

    public int getState() {
        return state;
    }

    public double run(int distance) {
        int currentEndurance = getEndurance() - distance;
        System.out.println("run: текущая выносливость животного " + name + ": " + currentEndurance);
        if (currentEndurance <= 0) {
            state++;
            return -1;
        } else
            return (double) distance / getRunSpeed();
    }


    public abstract double swim(int distance);

    public abstract void info(String activityType);
}
