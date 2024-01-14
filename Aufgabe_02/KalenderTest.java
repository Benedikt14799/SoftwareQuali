package Aufgabe_02;

import  org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KalenderTest {
    @Test
    public void testTagGültigJanuar() {
        Kalender kalender = new Kalender();
        int tag = 28;
        int monat = 2;

        // Act
        boolean gültig = kalender.tagGültig(tag, monat);

        // Assert
        assertTrue(gültig);
    }
}
