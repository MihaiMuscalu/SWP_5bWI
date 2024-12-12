package at.mus.SortingAlgorithms;

import at.mus.BasicAlgorithms.DataGenerator;

public class MainSorter {
    public static void main(String[] args) {
        int[] data = { 3, 1, 3, 2, 2 };
        Sorter BS = new BubbleSort();
        int[] RBS = BS.sort(data);

        System.out.println("Original Array: ");
        DataGenerator.printArray(data);

        System.out.println("\n");
        System.out.println("BubbleSort: ");
        DataGenerator.printArray(RBS);

        System.out.println("\n");

        Sorter SS = new SelectionSort();
        int[] RSS = BS.sort(data);
        System.out.println("SelectionSort: ");
        DataGenerator.printArray(RSS);

    }
}
