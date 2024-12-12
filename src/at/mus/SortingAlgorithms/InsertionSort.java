package at.mus.SortingAlgorithms;

public class InsertionSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int[] arr = data.clone();

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            // Move number one position forward if its greater than next number
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        return arr;
    }

    @Override
    public String getSorterName() {
        return "InsertionSort";
    }
}