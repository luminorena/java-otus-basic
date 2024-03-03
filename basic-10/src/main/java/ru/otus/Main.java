package ru.otus;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Николай", "Алексеевич", "Кошкин");
        Person person2 = new Person("Игорь", "Иванович", "Кошкин");
        Person person3 = new Person("Илья", "Петрович", "Копытин");
        PersonActions personActions = new PersonActions();
        personActions.add(person1, List.of(123456));
        personActions.add(person2, List.of(123456, 654321));
        personActions.add(person3, List.of(12345));
        System.out.println(personActions);
        personActions.find("Кошкин");
        System.out.println(personActions
                .containsPhoneNumber(Collections.singletonList(123456)));
    }















}

