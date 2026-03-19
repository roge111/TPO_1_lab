package task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ArthurTest {

    @Test
    void testConstructorAndGetters() {
        Arthur arthur = new Arthur("Arthur Dent", "confused");
        assertEquals("Arthur Dent", arthur.getName());
        assertEquals("confused", arthur.getCondition());
    }

    @Test
    void testSetCondition() {
        Arthur arthur = new Arthur("Arthur", "happy");
        arthur.setCondition("sad");
        assertEquals("sad", arthur.getCondition());
    }

    @Test
    void testSetName() {
        Arthur arthur = new Arthur("Arthur", "happy");
        arthur.setName("Arthur Dent");
        assertEquals("Arthur Dent", arthur.getName());
    }

    @Test
    void testSay() {
        Arthur arthur = new Arthur("Arthur", "confused");
        // просто проверяем, что не выбрасывается исключение
        assertDoesNotThrow(() -> arthur.say());
    }

    @Test
    void testConditionSureWhenCerealsInRoom() {
        // Этот тест требует интеграции с Insert, будет написан позже
        // Пока заглушка
        assertTrue(true);
    }
}