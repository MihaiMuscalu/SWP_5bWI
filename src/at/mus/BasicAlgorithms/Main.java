package at.mus.BasicAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] arr = DataGenerator.generateDataArray(4, 0, 10);
        DataGenerator.printArray(arr);
        int[] revertedArr = DataGenerator.revert(arr);

        System.out.println("\nReverted array: ");
        DataGenerator.printArray(revertedArr);
    }
}
