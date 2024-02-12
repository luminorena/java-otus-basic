package ru.otus;

public class Plate {
    private int currentFoodCount;
    private int plateCapacity;

    public Plate(int plateCapacity) {
        this.plateCapacity = plateCapacity;
        this.currentFoodCount = this.plateCapacity;
    }


    public int getCurrentFoodCount() {
        return currentFoodCount;
    }

    void addFood(FoodPacket foodPacket) {
        double amountToAdd = Math.abs(foodPacket.getFoodAmount() - plateCapacity);
        if (currentFoodCount != plateCapacity) {
            currentFoodCount += amountToAdd;
            System.out.println("Тарелка пополнилась на количество, равное " +
                    amountToAdd);
            double packetCountParam = amountToAdd / foodPacket.getFoodAmount();
            System.out.println("Было использовано " + Math.ceil(packetCountParam) + " пакетов еды");

        } else System.out.println("В тарелке достаточно еды, пополнение невозможно");

    }


    public boolean decreaseFood(int amount) {
        currentFoodCount -= amount;
        if (currentFoodCount <= 0) {
            currentFoodCount = 0;
            System.out.println("Нельзя уменьшить количество еды на объём," +
                    " больший текущего количества!");

        }
        return currentFoodCount > 0;

    }
}
