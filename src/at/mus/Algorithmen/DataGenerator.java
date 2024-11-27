package at.mus.Algorithmen;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size, int min, int max) {

        Random rand = new Random();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(max - 1) + min + 1;
        }
        return data;

    }

    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.println("Number: " + i);
        }

    }
}
