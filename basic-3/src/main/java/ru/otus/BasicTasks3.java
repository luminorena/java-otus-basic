package ru.otus;

import java.util.Arrays;

public class BasicTasks3 {
    public static void main(String[] args) {
        System.out.println(sumOfPositiveElements(new int[][] {{1, 3, -4, 3}, {1, -1, -1, -1}}));
        System.out.println("--------------------------------------------------------");
        squareWithStars(4);
        System.out.println("--------------------------------------------------------");
        makeDiagonalZero(new int[][] {{1, 3, 4, 3}, {2, 1, 4, 3}, {1, 3, 4, 3}, {2, 1, 4, 3}});
        System.out.println("--------------------------------------------------------");
        findMax(new int[][] {{0, -3, 4, 3}, {2, 1, 4, 333}, {1, 3, 4, 3}, {2, 1, 4, 3}});
        System.out.println("--------------------------------------------------------");
        System.out.println(sumOfSecondLine(new int[][]{{1, 3, 4, 3}, {2, 1, 4, 3}, {1, 3, 4, 3}, {2, 1, 4, 3}}));
        System.out.println("--------------------------------------------------------");
        System.out.println( sumOfSecondLine(new int[][]{{1, 3, 4, 3}}));

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sumOfPositives = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sumOfPositives += arr[i][j];
                }
            }
        }
        System.out.println("Сумма положительных элементов двумерного массива "
                + Arrays.deepToString(arr));
        return sumOfPositives;
    }

    public static void squareWithStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void makeDiagonalZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)
                    arr[i][j] = 0;
                if (i + j == arr.length - 1)
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println(max);
    }

    public static int sumOfSecondLine(int[][] arr) {
        System.out.println("Исходный массив: " + Arrays.deepToString(arr));
        int sum = 0;
        int[] secondary = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
          //  for (int j = 0; j < arr[i].length; j++) {
                if (arr.length == 1) {
                    return -1;
                }
          //  }
        }
        for (int j = 0; j < secondary.length; j++) {
            secondary[j] = arr[1][j];
            sum += secondary[j];
        }
        System.out.println(Arrays.toString(secondary));
        return sum;
    }
}
