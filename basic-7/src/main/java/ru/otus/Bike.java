package ru.otus;


public class Bike implements Transport {
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
        return true;
    }
}



