package at.mus.SortingAlgorithms;

public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int[] arr = data.clone();

        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the minimum element in the remaining array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }

    @Override
    public String getSorterName() {
        return "SelectionSort";
    }
}
