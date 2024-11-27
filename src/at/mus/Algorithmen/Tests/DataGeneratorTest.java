package at.mus.Algorithmen.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.mus.Algorithmen.DataGenerator;

public class DataGeneratorTest {

    @Test
    void testGenerateDataArray() {
        boolean check = false;
        int[] arr = DataGenerator.generateDataArray(4, 0, 10);
        Assertions.assertEquals(arr.length, 4);
        for (int i : arr) {
            if (i > 10 || i < 0) {
                check = false;
                Assertions.assertTrue(check);
                break;
            }
            check = true;
            Assertions.assertTrue(check);
        }
    }

    @Test
    void testPrintArray() {
        int[] arr = DataGenerator.generateDataArray(4, 0, 10);
        DataGenerator.printArray(arr);
    }
}
