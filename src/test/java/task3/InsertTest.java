package test.java.task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertTest {

    @Test
    void testInsertFishIntoEarSatisfiesFord() {
        Fish fish = new Fish(null);
        Ford ford = new Ford("Ford", "Neutral");
        Insert insert = new Insert();

        insert.insertFish(fish, Places.EAR, ford);

        assertEquals(Places.EAR, fish.place);
        assertEquals("Satisfied", ford.getCondition());
    }

    @Test
    void testInsertFishIntoNonEarDoesNothing() {
        Fish fish = new Fish(null);
        Ford ford = new Ford("Ford", "Neutral");
        Insert insert = new Insert();

        insert.insertFish(fish, Places.EYE, ford);

        assertNull(fish.place);
        assertNotEquals("Satisfied", ford.getCondition());
    }

    @Test
    void testInsertFishAlreadyInEar() {
        Fish fish = new Fish(Places.EAR);
        Ford ford = new Ford("Ford", "Neutral");
        Insert insert = new Insert();

        insert.insertFish(fish, Places.EAR, ford);

        assertEquals(Places.EAR, fish.place);
        // Condition unchanged because fish already in ear
        assertEquals("Neutral", ford.getCondition());
    }

    @Test
    void testInsertCerealsIntoRoomMakesArthurSure() {
        Cereals cereals = new Cereals("Wheat");
        Arthur arthur = new Arthur("Arthur", "Unsure");
        Insert insert = new Insert();

        insert.insertCereals(cereals, Places.Room, arthur);

        assertEquals(Places.Room, cereals.place);
        assertEquals("Sure", arthur.getCondition());
    }

    @Test
    void testInsertCerealsIntoEyePrintsWarning() {
        Cereals cereals = new Cereals("Barley");
        Arthur arthur = new Arthur("Arthur", "Unsure");
        Insert insert = new Insert();

        insert.insertCereals(cereals, Places.EYE, arthur);

        // place should not be changed
        assertNull(cereals.place);
        assertEquals("Unsure", arthur.getCondition());
    }

    @Test
    void testInsertCerealsAlreadyInRoom() {
        Cereals cereals = new Cereals("Oats");
        cereals.place = Places.Room;
        Arthur arthur = new Arthur("Arthur", "Unsure");
        Insert insert = new Insert();

        insert.insertCereals(cereals, Places.Room, arthur);

        assertEquals(Places.Room, cereals.place);
        // Condition unchanged because already in room
        assertEquals("Unsure", arthur.getCondition());
    }
}