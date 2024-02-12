package ru.otus;

public abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int endurance;


    public Animal(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
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


    public double run(int distance) {
        endurance -= distance;
        System.out.println("run: текущая выносливость животного " + name + ": " + endurance);
        if (endurance <= 0) {
            return -1;
        } else
            return (double) distance / runSpeed;
    }


    public abstract double swim(int distance);


    public void info(String activityType) {
        String result;
        switch (activityType) {
            case "run":
                result = (endurance > 0) ? "у животного " + name + " появилась усталость" : "животное " + name + " полно сил";
                break;
            case "swim":
                result = (swimSpeed == -1) ? "животное " + name + " не умеет плавать" :
                        (endurance > 0) ? "у животного " + name + " появилась усталость" : "животное " + name + " полно сил";
                break;
            default:
                result = "неизвестное поведение";
                break;
        }
        System.out.println(activityType + ": " + result);
    }
}
