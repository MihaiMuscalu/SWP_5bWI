package at.mus.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.mus.SortingAlgorithms.Sorter;
import at.mus.SortingAlgorithms.BubbleSort;

public class BubbleSortTest {

    Sorter sorter = new BubbleSort();

    @Test
    void testSort() {
        int[] data = { 5, 1, 4, 2, 8 };
        int[] expected = { 1, 2, 4, 5, 8 };

        int[] result = sorter.sort(data);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSortReverseOrder() {
        int[] data = { 9, 7, 5, 3, 1 };
        int[] expected = { 1, 3, 5, 7, 9 };

        int[] result = sorter.sort(data);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSortWithDuplicates() {
        int[] data = { 3, 1, 3, 2, 2 };
        int[] expected = { 1, 2, 2, 3, 3 };

        int[] result = sorter.sort(data);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSortEmptyArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sorter.sort(new int[0]);
        });
    }

}
