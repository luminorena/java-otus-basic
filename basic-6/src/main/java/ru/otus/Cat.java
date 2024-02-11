package ru.otus;

public class Cat {
    String name;
    int maxNeededFood;
    boolean isHungry;

    public Cat(String name, int maxNeededFood) {
        this.name = name;
        this.maxNeededFood = maxNeededFood;
        this.isHungry = true;
    }

    public void eat(Plate plate) {
        if (isHungry && maxNeededFood > plate.getCurrentFoodCount()) {
            System.out.println(name + ": \"Положите еды! Мне не хватает!\"" +
                    "\n" + "Кот голоден");
        } else if (isHungry && maxNeededFood <= plate.getCurrentFoodCount()) {
            System.out.println(name + " поел на количество еды " + maxNeededFood +
                    "\n" + "Кот сыт");
            System.out.println(plate.decreaseFood(maxNeededFood));
            isHungry = false;
        } else {
            System.out.println(name + " не голоден");
        }
    }
}
