package ru.otus;

public class Horse extends Animal {
    private int state;

    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public double swim(int distance) {
        int currentEndurance = getEndurance() - 4 * distance;
        System.out.println("swim: текущая выносливость животного " + getName() + ": " + currentEndurance);
        if (currentEndurance <= 0) {
            state++;
            return -1;
        } else
            return (double) distance / getRunSpeed();
    }

    @Override
    public void info(String activityType) {
        String result;
        switch (activityType) {
            case "run":
                result = (getState() > 0) ? "у животного " + getName() + " появилась усталость" : "животное " + getName() + " полно сил";
                break;
            case "swim":
                result = (state > 0) ? "у животного " + getName() + " появилась усталость" : "животное " + getName() + " полно сил";
                break;
            default:
                result = "неизвестное поведение";
                break;
        }
        System.out.println(activityType + ": " + result);
    }
}
