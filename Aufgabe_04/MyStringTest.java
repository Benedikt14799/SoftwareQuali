package Aufgabe_04;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyStringTest {

    MyString myString = new MyString("Hello");

    // Phase 0: Setup
    @Before
    public void setUp() {
        // Hier erfolgt die Initialisierung, die für alle Tests gemeinsam ist
        MyString myString = new MyString("Hello");
    }

    // Test 1
    @Test
    public void testEqualsSameObject() {
        boolean result = myString.equals(myString);
        assertTrue(result); // Überprüft, ob das Objekt gleich sich selbst ist
    }

    // Test 2:
    @Test
    public void testEqualsDifferentObjectsWithSameContent() {
        // Überprüft, ob verschiedene Objekte mit dem gleichen Inhalt als gleich betrachtet werden
        boolean result = myString.equals(new MyString("Hello"));
        assertTrue(result);
    }

    // Test 3:
    @Test
    public void testEqualsDifferentObjectsWithDifferentContent() {
        // Überprüft, ob verschiedene Objekte mit unterschiedlichem Inhalt als ungleich betrachtet werden
        boolean result = myString.equals(new MyString("World"));
        assertFalse(result);
    }

    // Test 4:
    @Test
    public void testEqualsDifferentClasses() {
        // Überprüft, ob Objekte unterschiedlicher Klassen als ungleich betrachtet werden
        boolean result = myString.equals("Hello");
        assertFalse(result);
    }

    @Test
    public void testEqualsDifferentLength() {
        // Überprüft, ob Objekte mit unterschiedlichen Längen als ungleich betrachtet werden
        boolean result = myString.equals(new MyString("Hi"));
        assertFalse(result);
    }

        @After
    void tearDown() {
    }


}