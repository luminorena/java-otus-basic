package ru.otus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BasicComplicated {
    public static void main(String[] args) {
        unionTwoArraysOld(new int[]{3, 1, 4, 4, 2, 18}, new int[]{3, 4, 2, 4});
        System.out.println("-------------------------------------------");
        unionTwoArraysNew(new int[]{3, 1, 4, 4, 2, 18}, new int[]{3, 4, 2, 4});
        System.out.println("-------------------------------------------");
        unionManyArrays(new int[]{2, 4, 5, 8}, new int[]{1, 3, 89});
        System.out.println("-------------------------------------------");
        isSorted(new int[]{-1, -2, -4});
        System.out.println("-------------------------------------------");
        reverseArray(new Integer[]{-1, -445, -4});
        System.out.println("-------------------------------------------");
        equalArrays(new int[]{2, 1, 1, 3, -3});
    }


    public static void unionManyArrays(int[]... ar) {
        int maxLength = 0;
        for (int[] arr : ar) {
            if (arr.length > maxLength) {
                maxLength = arr.length;
            }
        }
        int[] result = new int[maxLength];
        for (int[] arr : ar) {
            for (int i = 0; i < arr.length; i++) {
                result[i] += arr[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }

    public static void unionTwoArraysOld(int[] arr, int[] arr1) {
        int length = (Math.max(arr.length, arr1.length));
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < arr.length)
                result[i] += arr[i];
            if (i < arr1.length)
                result[i] += arr1[i];
        }
        System.out.println(Arrays.toString(result));

    }

    public static void unionTwoArraysNew(int[] arr, int[] arr1) {
        int length = Math.max(arr.length, arr1.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        int[] result = new int[length];
        for (int[] ar : new int[][]{arr, arr1}) {
            for (int i = 0; i < ar.length; i++) {
                result[i] += ar[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void isSorted(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array, 0, copiedArray, 0, array.length);
        System.out.println("Исходный массив " + Arrays.toString(array));
        Arrays.sort(copiedArray);
        String result = "массив не отсортирован";
        for (int i = 0; i < copiedArray.length; i++) {
            if (array[i] == copiedArray[i]) {
                result = "по возрастанию";
                break;
            }
        }
        for (int i = copiedArray.length - 1; i >= 0; i--) {
            if (array[i] == copiedArray[i]) {
                result = "по убыванию";
                break;
            }
        }
        System.out.println(result);

    }

    public static void reverseArray(Integer[] array) {
        System.out.println("Исходный массив " + Arrays.toString(array));
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println("Перевернутый массив " + list);
    }

    public static void equalArrays(int[] arr) {
        System.out.println("Исходный массив " + Arrays.toString(arr));
        if (arr.length < 2) {
            System.out.println(false);
            return;
        }
        int overallSum = IntStream.of(arr).sum();
        if (overallSum % 2 != 0) {
            System.out.println("false");
            return;
        }
        int i = 0;
        int j = arr.length - 1;
        int sum1 = arr[i];
        int sum2 = arr[j];
        do {
            if (sum1 > overallSum / 2) {
                i++;
                sum1 += arr[i];
            } else if (sum2 > overallSum / 2) {
                j--;
                sum2 += arr[j];
            } else if (sum1 < sum2) {
                i++;
                sum1 += arr[i];
            } else {
                j--;
                sum2 += arr[j];
            }
        }
        while (i < j - 1) ;
        if (sum1 == sum2)
            for (i = 0; i < arr.length; i++) {
                if (i == j)
                    System.out.print("| ");
                System.out.print(arr[i] + " ");
            }
        else
            System.out.println(false);
        System.out.println();
    }
}




