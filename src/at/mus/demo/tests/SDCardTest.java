package at.mus.demo.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import at.mus.demo.SDCard;

public class SDCardTest {

    SDCard one = new SDCard(1000);

    @Test
    void testGetCapacity() {

        assertEquals(one.getCapacity(), 1000);
    }

    @Test
    void testGetFiles() {

        assertEquals(one.getFiles().size(), 0);
    }

    @Test
    void testGetFreeSpace() {

        assertEquals(one.getFreeSpace(), 1000);
    }
}
