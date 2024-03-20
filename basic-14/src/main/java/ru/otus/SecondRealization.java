package ru.otus;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SecondRealization {
    public synchronized static void main(String[] args) throws InterruptedException {
        long initialTime = System.currentTimeMillis();
        AtomicInteger increment = new AtomicInteger();
        int size = 100_000_000;
        double[] arr = new double[size];
        int partSize = arr.length / 4;

        Thread t1 = new Thread(() -> {
            double[] part1 = Arrays.copyOfRange(arr, 0, partSize);
            for (int i = 0; i < part1.length; i++) {
                part1[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                System.out.println(increment.incrementAndGet() + " " + part1[i]);
            }
        });

        Thread t2 = new Thread(() -> {
            double[] part2 = Arrays.copyOfRange(arr, partSize, 2 * partSize);
            for (int i = 0; i < part2.length; i++) {
                part2[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                System.out.println(increment.incrementAndGet() + " " + part2[i]);
            }
        });

        Thread t3 = new Thread(() -> {
            double[] part3 = Arrays.copyOfRange(arr, 2 * partSize, 3 * partSize);
            for (int i = 0; i < part3.length; i++) {
                part3[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                System.out.println(increment.incrementAndGet() + " " + part3[i]);
            }
        });

        Thread t4 = new Thread(() -> {
            double[] part4 = Arrays.copyOfRange(arr, 3 * partSize, arr.length);
            for (int i = 0; i < part4.length; i++) {
                part4[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                System.out.println(increment.incrementAndGet() + " " + part4[i]);
            }
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();


        long endTime = System.currentTimeMillis();
        System.out.println(endTime - initialTime);

    }
}
