package ru.otus;

public class Horse extends Human implements Transport {
    protected String name;
    protected int horsePower;


    public Horse(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "лошадь по имени " + name;
    }


    @Override
    public boolean move(int distance, TerritoryType territoryType) {
        if (territoryType.equals(TerritoryType.SWAMP)) {
            System.out.println("Лошадь не может гулять по болоту");
            return false;
        }
        System.out.println("Лошадь " + name + " имеет силу, равную " + horsePower);
        if (horsePower - distance < 0) {
            System.out.println("У лошади нет сил пройти расстояние " + distance);
            return false;
        }
        horsePower -= distance;
        humanPower = humanPower - Math.random() * distance;

        if (humanPower < 0) {
            System.out.println("Человек очень устал, ему нужен отдых");
            return false;
        } else {
            System.out.println("У человека на лошади осталось " + Math.ceil(humanPower) + " сил");
            System.out.println("Лошадь " + name + " прошла расстояние " + distance);
            return true;
        }
    }


}
