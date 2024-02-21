package ru.otus;


public class OffRider implements Transport {
    protected String type;
    protected int petrolCount;


    public OffRider(String type, int petrolCount) {
        this.type = type;
        this.petrolCount = petrolCount;
    }

    @Override
    public String toString() {
        return "вездехода марки " + type;
    }

    @Override
    public boolean move(int distance, TerritoryType territoryType) {
        System.out.println("Вездеход " + type + " имеет бензин в количестве " + petrolCount);
        if (petrolCount - distance < 0) {
            System.out.println("У вездехода нет бензина пройти расстояние " + distance);
            return false;
        }
        petrolCount -= distance;
        System.out.println("Вездеход " + type + " прошёл расстояние " + distance);
        return true;
    }


}
