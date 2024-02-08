package ru.otus;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public double swim(int distance) {
        throw new UnsupportedOperationException("Операция недоступна для животного " + getName());
    }

    @Override
    public void info(String activityType) {
        String result;
        if ("run".equals(activityType)) {
            result = (getState() > 0) ? "у животного " + getName() + " появилась усталость" : "животное " + getName() + " полно сил";
        } else {
            result = "неизвестное поведение";
        }
        System.out.println(activityType + ": " + result);
    }


}
