package at.mus.demo.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import at.mus.demo.SDCard;

public class SDCardTest {
    @Test
    void testTakePhoto() {
        SDCard one = new SDCard(1000);
        one.TakePhoto();
        assertEquals(one.getFiles().get(0).getSize(), 300);

    }

    @Test
    void testGetCapacity() {
        SDCard one = new SDCard(1000);
        assertEquals(one.getCapacity(), 1000);
    }

    @Test
    void testGetFiles() {
        SDCard one = new SDCard(1000);
        one.TakePhoto();
        assertEquals(one.getFiles().size(), 1);
    }

    @Test
    void testGetFreeSpace() {
        SDCard one = new SDCard(1000);
        one.TakePhoto();
        assertEquals(one.getFreeSpace(), 700);
    }
}
