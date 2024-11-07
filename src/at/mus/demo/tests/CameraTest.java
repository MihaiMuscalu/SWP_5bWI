package at.mus.demo.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.mus.demo.SDCard;

public class CameraTest {

    SDCard one = new SDCard(1000);

    @BeforeEach
    @Test
    void testTakePhoto() {

        assertEquals(one.getFiles().get(0).getSize(), 0);

    }

}
