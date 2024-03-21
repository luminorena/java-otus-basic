package ru.otus;

public class FirstRealization {
    public static void main(String[] args) {
        firstRealization();
    }

    public static void firstRealization() {
        long initialTime = System.currentTimeMillis();
        int size = 100_000_000;
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            System.out.println(arr[i]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - initialTime);
    }

}
