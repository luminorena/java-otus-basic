package ru.otus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDataBase {
    Person person1 = new Person(1L, "Olga", Position.DEVELOPER);
    Person person2 = new Person(2L, "Kolya", Position.BRANCH_DIRECTOR);
    Person person3 = new Person(3L, "Misha", Position.DIRECTOR);
    Person person4 = new Person(3L, "Vitya", Position.DRIVER);
    Person person5 = new Person(4L, "Sveta", Position.ENGINEER);
    Person person6 = new Person(6L, "Masha", Position.JANITOR);
    Person person7 = new Person(7L, "Vanya", Position.JUNIOR_DEVELOPER);
    Person person8 = new Person(8L, "Stanislav", Position.SENIOR_MANAGER);
    Person person9 = new Person(9L, "Alexey", Position.MANAGER);
    Person person10 = new Person(10L, "Vladislav", Position.QA);
    Person person11 = new Person(11L, "Vova", Position.PLUMBER);
    List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3,
            person4, person5, person6, person7, person8, person9, person10, person11));


    void findById(Long id) {
        boolean found = false;
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                System.out.println(person);
                found = true;
            }
        }
        if (!found)
            System.out.println("Не нашлось");
    }

    void add(Person person) {
        personList.add(person);
        Person addedPerson = personList.get(personList.size() - 1);
        System.out.println("Добавлен новый элемент в список: " + addedPerson);
    }

    boolean isManager(Person person){
        return person.getPosition().equals(Position.MANAGER)
                || person.getPosition().equals(Position.DIRECTOR)
                || person.getPosition().equals(Position.BRANCH_DIRECTOR)
                || person.getPosition().equals(Position.SENIOR_MANAGER);
    }

    boolean isEmployee(Person person) {
        return !person.getPosition().equals(Position.MANAGER)
                || !person.getPosition().equals(Position.DIRECTOR)
                || !person.getPosition().equals(Position.BRANCH_DIRECTOR)
                || !person.getPosition().equals(Position.SENIOR_MANAGER);
    }


}
