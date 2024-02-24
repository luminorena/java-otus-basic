package ru.otus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sequenceOfElements(1, 6));
        System.out.println("--------------------------------------------");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(sumElements(list));
        System.out.println("--------------------------------------------");
        modifyList(2, list);
        System.out.println("--------------------------------------------");
        increaseListElements(5, list);
        System.out.println("--------------------------------------------");

        Employee employee1 = new Employee();
        employee1.setName("Марк");
        employee1.setAge(40);

        Employee employee2 = new Employee();
        employee2.setName("Макар");
        employee2.setAge(30);

        Employee employee3 = new Employee();
        employee3.setName("Илья");
        employee3.setAge(15);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println(getEmployeeNames(employeeList));
        System.out.println("--------------------------------------------");
        System.out.println(getEmployeeByAge(employeeList, 34));
        System.out.println("--------------------------------------------");
        System.out.println(isAverageAgeGreater(employeeList, 25));
        System.out.println("--------------------------------------------");
        System.out.println(getTheYoungest(employeeList));
    }

    public static List<Integer> sequenceOfElements(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static int sumElements(List<Integer> list) {
        int sum = 0;
        for (Integer value : list) {
            if (value > 5) {
                sum += value;
            }
        }
        return sum;
    }

    public static void modifyList(int number, List<Integer> list) {
        System.out.println("Первоначальный список " + list);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(number);
        }
        System.out.println("Модифицированный список " + list);

    }

    public static void increaseListElements(int number, List<Integer> list) {
        System.out.println("Первоначальный список " + list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        System.out.println("Модифицированный список " + list);
    }

    public static List<String> getEmployeeNames(List<Employee> list) {
        List<String> names = new ArrayList<>();
        for (Employee element : list) {
            names.add(element.getName());
        }
        return names;

    }

    public static List<Employee> getEmployeeByAge(List<Employee> list, int minAge) {
        List<Employee> people = new ArrayList<>();
        for (Employee element : list) {
            if (element.getAge() >= minAge) {
                people.add(element);
            }
        }
        return people;
    }

    public static boolean isAverageAgeGreater(List<Employee> list, int avgAge) {
        int calculateAvgAge = 0;
        for (Employee element : list) {
            calculateAvgAge += element.getAge();
        }
        return calculateAvgAge / list.size() > avgAge;
    }


    public static Employee getTheYoungest(List<Employee> list) {
        int minAge = list.get(0).getAge();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < minAge) {
                minAge = list.get(i).getAge();
                index = i;
            }
        }
        return list.get(index);
    }
}






