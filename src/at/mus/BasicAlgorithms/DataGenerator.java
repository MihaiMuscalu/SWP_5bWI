package at.mus.BasicAlgorithms;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size, int min, int max) {

        Random rand = new Random();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt((max - min) + 1) + min;
        }
        return data;

    }

    public static void printArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] revert(int[] data) {
        int[] temp = new int[data.length];

        for (int i = 1; i <= temp.length; i++) {
            temp[temp.length - i] = data[i - 1];
        }

        return temp;
    }

    public static int max(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int temp = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > temp) {
                temp = data[i];
            }
        }
        return temp;
    }

    public static int min(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int temp = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < temp) {
                temp = data[i];
            }
        }
        return temp;
    }

}
