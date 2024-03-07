package ru.otus;

import java.util.Arrays;

import static ru.otus.SortArrays.quickSort;

public class Main {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();
        personDataBase.findById(2L);
        Person person13 = new Person(12L, "Vova", Position.DEVELOPER);
        personDataBase.add(person13);
        System.out.println(personDataBase.isManager(person13));
        System.out.println(personDataBase.isEmployee(person13));

        int[] array = new int[] {1, -2, 12, 3, -1 -4, 0, 17};
        SortArrays.bubbleSort(array);

        int[] sortArr = {2, 5, -3, 23, 0, -2};
        quickSort(sortArr, 0, sortArr.length - 1);
        System.out.println(Arrays.toString(sortArr));
    }
}
