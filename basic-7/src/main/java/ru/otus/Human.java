package ru.otus;

public class Human implements Transport {
    protected String name;
    protected Transport currentTransport;
    protected static double humanPower;


    public Human(String name, Transport currentTransport, double humanPower) {
        this.name = name;
        this.currentTransport = currentTransport;
        Human.humanPower = humanPower;
    }

    public Human() {
    }

    public void info() {
        if (currentTransport != null)
            System.out.println("Человек " + name + " сел в " + currentTransport);
        else System.out.println("Человек идёт пешком");
    }


    @Override
    public boolean move(int distance, TerritoryType territoryType) {
        if (currentTransport != null) {
            var res = currentTransport.move(distance, territoryType);
            if (res) {
                System.out.println("Человек слез с " + currentTransport);
                currentTransport = null;
            }
            return res;
        }
        System.out.println("Человек " + name + " имеет силу, равную " + humanPower);
        if (humanPower - distance < 0) {
            System.out.println("У человека нет сил пройти расстояние " + distance);
            return false;
        }
        humanPower -= distance;
        System.out.println("Человек " + name + " прошел расстояние " + distance);
        return false;
    }

    public boolean calculateHumanPower() {
        if (humanPower < 0) {
            System.out.println("Человек очень устал, ему нужен отдых");
            return false;
        } else {
            System.out.println("У человека на транспорте осталось " + Math.ceil(humanPower) + " сил");
            return true;
        }
    }


}
