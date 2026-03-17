package test.java.task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CerealsTest {

    @Test
    void testConstructor() {
        Cereals cereals = new Cereals("Wheat");
        assertEquals("Wheat", cereals.typeCerals);
        assertNull(cereals.place);
    }

    @Test
    void testPlaceAssignment() {
        Cereals cereals = new Cereals("Barley");
        cereals.place = Places.Room;
        assertEquals(Places.Room, cereals.place);
    }
}