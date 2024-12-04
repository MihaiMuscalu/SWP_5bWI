package at.mus.SortingAlgorithms;

public class BubbleSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int[] arr = data.clone();

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
