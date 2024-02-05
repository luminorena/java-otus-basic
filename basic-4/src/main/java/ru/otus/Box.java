package ru.otus;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private String objectName;
    private boolean state;
    private boolean isEmpty;

    public String getObjectName() {
        return objectName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void printData() {
        System.out.println("длина: " + length + "\nширина: " +
                width + "\nвысота: " + height + "\nцвет: " + color);
    }

    public void setState(boolean state) {
        this.state = state;
        String message = (state) ? "Коробка открыта!" : "Коробка закрыта!";
        System.out.println(message);
    }

    public void putObject(String objectName) {
        this.objectName = objectName;
        isEmpty = true;
        if (state) {
            System.out.println("В коробку положили предмет: " + objectName);
            isEmpty = false;
        } else
            System.out.println("Откройте коробку. " +
                    "Невозможно положить предмет в закрытую коробку");


    }

    public void takeObject() {
        if (!isEmpty && state)
            System.out.println("Из коробки достали предмет: " + getObjectName());
        else
            System.out.println("Коробка закрыта! " +
                    "Невозможно достать предмет из закрытой коробки");
    }
}
