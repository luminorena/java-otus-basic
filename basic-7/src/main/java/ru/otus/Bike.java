package ru.otus;

public class Bike extends Human implements Transport {
    protected String type;


    public Bike(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "велосипеда марки " + type;
    }

    @Override
    public boolean move(int distance, TerritoryType territoryType) {
        if (territoryType.equals(TerritoryType.SWAMP)) {
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
        humanPower = humanPower - Math.random() * distance;
        if (humanPower < 0) {
            System.out.println("Человек очень устал, ему нужен отдых");
            return false;
        } else {
            System.out.println("У человека на велосипеде осталось " + Math.ceil(humanPower) + " сил");
            System.out.println("Велосипед марки " + type + " прошёл расстояние " + distance);
            return true;
        }
    }


}
