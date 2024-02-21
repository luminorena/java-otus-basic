package ru.otus;

public class Human  {
    protected String name;
    protected Transport currentTransport;
    protected double personPower;

    public Human(String name, Transport currentTransport, double personPower) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.personPower = personPower;
    }

    public Human() {
    }

    public void info() {
        if (currentTransport != null)
            System.out.println("Человек " + name + " сел в " + currentTransport);
        else System.out.println("Человек идёт пешком");
    }

    public boolean move(int distance, TerritoryType territoryType) {
        var remainingPower = personPower - Math.random() * distance;
        if (currentTransport != null) {
            var res = currentTransport.move(distance, territoryType);
            if (res) {
                System.out.println("Человек слез с " + currentTransport);
                currentTransport = null;
            }
            if (remainingPower < 0) {
                System.out.println("Человек устал, ему нужен отдых");
                return false;
            } else {
                System.out.println("У человека на транспорте осталось " +
                        Math.ceil(remainingPower) + " сил");
            }
            return res;
        }

        System.out.println("Человек " + name + " имеет силу, равную " + personPower);
        if (personPower - distance < 0) {
            System.out.println("У человека нет сил пройти расстояние " + distance);
            return false;
        } else {
            System.out.println("Человек " + name + " прошел расстояние " + distance);
            System.out.println("У человека осталось " + Math.ceil(remainingPower) + " сил");
            return true;
        }

    }
}
