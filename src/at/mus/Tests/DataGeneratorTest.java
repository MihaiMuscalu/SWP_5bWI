package at.mus.Tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.mus.BasicAlgorithms.DataGenerator;

public class DataGeneratorTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testGenerateDataArray() {
        int size = 5;
        int min = 10;
        int max = 20;

        int[] generatedArray = DataGenerator.generateDataArray(size, min, max);

        // Check array size
        Assertions.assertEquals(size, generatedArray.length);

        // Check each element is within bounds
        for (int value : generatedArray) {
            Assertions.assertTrue(value >= min && value <= max,
                    "Value " + value + " is out of bounds [" + min + ", " + max + "]");
        }
    }

    @Test
    void testPrintArray() {
        int[] arr = { 1, 2, 3, 4 };
        DataGenerator.printArray(arr);
        System.setOut(standardOut); // Restore standard output

        // Normalize output to avoid trailing whitespace issues
        String capturedOutput = outputStream.toString().trim().replace("\r\n", "\n");
        String expectedOutput = "Number: 1\nNumber: 2\nNumber: 3\nNumber: 4";

        Assertions.assertEquals(expectedOutput, capturedOutput);
    }

    @Test
    void testRevert() {
        int[] original = { 1, 2, 3, 4 };
        int[] expectedReversed = { 4, 3, 2, 1 };

        int[] reversed = DataGenerator.revert(original);

        Assertions.assertArrayEquals(expectedReversed, reversed);
    }

    @Test
    void testMax() {
        int[] data = { 3, 1, -5, 7, 4 };
        int expectedMax = 7;

        int result = DataGenerator.max(data);

        Assertions.assertEquals(expectedMax, result);

    }

    @Test
    void testMaxWithNegativeValues() {
        int[] data = { -10, -20, -3, -7 };
        int expectedMax = -3;

        int result = DataGenerator.max(data);

        Assertions.assertEquals(expectedMax, result);
    }

    @Test
    void testMaxWithSingleElement() {
        int[] data = { 42 };
        int expectedMax = 42;

        int result = DataGenerator.max(data);

        Assertions.assertEquals(expectedMax, result);
    }

    @Test
    void testMaxWithEmptyArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DataGenerator.max(new int[0]);
        });
    }

    @Test
    void testMin() {
        int[] data = { 3, 1, -5, 7, 4 };
        int expectedMin = -5;

        int result = DataGenerator.min(data);

        Assertions.assertEquals(expectedMin, result);
    }

    @Test
    void testMinWithNegativeValues() {
        int[] data = { -10, -20, -3, -7 };
        int expectedMin = -20;

        int result = DataGenerator.min(data);

        Assertions.assertEquals(expectedMin, result);
    }

    @Test
    void testMinWithSingleElement() {
        int[] data = { 42 };
        int expectedMin = 42;

        int result = DataGenerator.min(data);

        Assertions.assertEquals(expectedMin, result);
    }

    @Test
    void testMinWithEmptyArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DataGenerator.min(new int[0]);
        });
    }

}
