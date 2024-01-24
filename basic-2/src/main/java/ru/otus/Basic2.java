package ru.otus;

import java.util.Arrays;

public class Basic2 {

    public static void main(String[] args) {
        fillArrayWithNumber(100, new int[5]);
        System.out.println("--------------------------------------------------------------------------");
        printStringManyTimes(8, " >");
        System.out.println("--------------------------------------------------------------------------");
        sumArray(new int[]{1, 3, 5, 8, 10});
        System.out.println("--------------------------------------------------------------------------");
        increaseArrayOnNumber(2, new int[5]);
        System.out.println("--------------------------------------------------------------------------");
        greatestHalf(new int[4]);
    }

    public static void printStringManyTimes(int number, String str) {
        System.out.println("Печатаем строку " + number + " раз");
        for (int i = 0; i < number; i++) {
            System.out.print(str + " ");
        }
    }

    public static void sumArray(int[] arr) {
        System.out.println("Сумма чисел массива " + Arrays.toString(arr) + " больше 5и ");
        int sum = Arrays.stream(arr).filter(x -> x > 5).sum();
        System.out.println(sum);
    }


    public static void fillArrayWithNumber(int number, int[] array) {
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((int) (Math.random() * (200 + 1)) - 10 + "  ");
        }
        System.out.println();
        System.out.println("Модифицированный массив: ");
        for (int i = 0; i < array.length; i++) {
            int element = array[i] = number;
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static void increaseArrayOnNumber(int number, int[] array) {
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((int) (Math.random() * (100 + 1)) - 10 + "  ");
        }
        System.out.println();
        System.out.println("Каждый элемент исходного массива "
                + "увеличивается на значение " + number);
        System.out.println("Модифицированный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] += array[i];
        }
        System.out.println();

    }


    public static void greatestHalf(int[] arr) {
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = (int) (Math.random() * (100 + 1)) - 10;
            sumFirst += arr[i];
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 + 1)) - 10;
            sumSecond += arr[i];
        }

        System.out.println("Исходный массив " + Arrays.toString(arr));
        System.out.println("Сумма первой части: " + sumFirst);
        System.out.println("Сумма второй части " + sumSecond);
        String sumResult = (sumFirst > sumSecond ? "Первая часть больше " + sumFirst : "Вторая часть больше " + sumSecond);
        System.out.println(sumResult);


    }
}
