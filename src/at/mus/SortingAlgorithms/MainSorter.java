package at.mus.SortingAlgorithms;

import at.mus.BasicAlgorithms.DataGenerator;

public class MainSorter {

    public static void testSort(Sorter sorter, int[] data) {
        System.out.println(sorter.getSorterName());

        long startTime = System.nanoTime(); // Start time measurement
        int[] result = sorter.sort(data);
        long endTime = System.nanoTime(); // End time measurement

        System.out.println("Sorted array:");
        DataGenerator.printArray(result);

        long duration = endTime - startTime; // Calculate duration
        System.out.println("Time taken: " + duration / 100 + " \u00B5" + "s / microseconds");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println();
        int[] data = DataGenerator.generateDataArray(5, 0, 40);
        System.out.println("Original array:");
        DataGenerator.printArray(data);
        System.out.println();

        testSort(new BubbleSort(), data.clone());
        testSort(new SelectionSort(), data.clone());
        testSort(new InsertionSort(), data.clone());
    }
}
