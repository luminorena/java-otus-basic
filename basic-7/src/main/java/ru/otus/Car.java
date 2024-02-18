package ru.otus;

import static ru.otus.Human.humanPower;

public class Car implements Transport {
    protected String type;
    protected int petrolCount;


    public Car(String type, int petrolCount) {
        this.type = type;
        this.petrolCount = petrolCount;
    }

    @Override
    public String toString() {
        return "машины марки " + type;
    }

    @Override
    public boolean move(int distance, TerritoryType territoryType) {
        if (territoryType.equals(TerritoryType.SWAMP) || territoryType.equals(TerritoryType.FOREST)) {
            System.out.println("Машина не может ехать в этом виде местности");
            return false;
        }

        System.out.println("Машина " + type + " имеет бензин в количестве " + petrolCount);
        if (petrolCount - distance < 0) {
            System.out.println("У машины нет бензина пройти расстояние " + distance);
            return false;
        }
        petrolCount -= distance;
        System.out.println("Машина " + type + " прошла расстояние " + distance);
        humanPower = humanPower - Math.random() * distance;
        return true;
    }
}
