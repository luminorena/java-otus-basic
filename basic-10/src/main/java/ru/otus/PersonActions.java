package ru.otus;

import java.util.*;

public class PersonActions {
    private Map<Person, List<Integer>> personMap = new HashMap<>();
    private List<List<Integer>> phoneNumbers = new ArrayList<>();


    @Override
    public String toString() {
        return personMap.entrySet().toString();
    }


    public void add(Person person, List<Integer> list) {
        personMap.put(person, list);
    }

    public void find(String lastName) {
        for (Map.Entry<Person, List<Integer>> entry : personMap.entrySet()) {
            if (entry.getKey().getLastName().equals(lastName)) {
                phoneNumbers.add(entry.getValue());
            }
        }

        System.out.println("Список телефонов человека по фамилии "
                + lastName + ": " + phoneNumbers);
    }

    public boolean containsPhoneNumber(List<Integer> list) {
        return (phoneNumbers.contains(list));
    }


}
