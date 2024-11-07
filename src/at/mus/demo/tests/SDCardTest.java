package at.mus.demo.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import at.mus.demo.SDCard;

public class SDCardTest {
    @Test
    void testTakePhoto() {
        SDCard one = new SDCard(1000);
        assertEquals(one.getFiles().get(0).getSize(), 0);

    }

    @Test
    void testGetCapacity() {
        SDCard one = new SDCard(1000);
        assertEquals(one.getCapacity(), 1000);
    }

    @Test
    void testGetFiles() {
        SDCard one = new SDCard(1000);
        assertEquals(one.getFiles().size(), 0);
    }

    @Test
    void testGetFreeSpace() {
        SDCard one = new SDCard(1000);
        assertEquals(one.getFreeSpace(), 1000);
    }
}
