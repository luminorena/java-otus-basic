package ru.otus;

public class Car extends Human implements Transport {
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
        humanPower = humanPower - Math.random() * distance;
        if (humanPower < 0) {
            System.out.println("Человек очень устал, ему нужен отдых");
            return false;
        } else {
            System.out.println("Машина " + type + " прошла расстояние " + distance);
            System.out.println("У человека на машине осталось " + Math.ceil(humanPower) + " сил");
            return true;
        }

    }


}
