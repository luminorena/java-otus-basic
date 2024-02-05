package ru.otus;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(faker.name().lastName(), faker.name().firstName(),
                    faker.name().firstName(), faker.number().numberBetween(1940, 2024),
                    faker.internet().emailAddress());
            if (users[i].getYearOfBirth() < 1984)
                users[i].printUserInfo();

        }

        System.out.println("----------------------------------------------------");
        Box box = new Box(270, 200, 195, "серый");
        box.setColor("белый");
        box.printData();
        box.setState(true);
        box.putObject("книга");
        box.takeObject();

    }
}
