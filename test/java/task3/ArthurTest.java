package java.task3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArthurTest {

    @Test
    public void testConstructorAndGetters() {
        Arthur arthur = new Arthur("Arthur Dent", "confused");
        assertEquals("Arthur Dent", arthur.getName());
        assertEquals("confused", arthur.getCondition());
    }

    @Test
    public void testSetCondition() {
        Arthur arthur = new Arthur("Arthur", "happy");
        arthur.setCondition("sad");
        assertEquals("sad", arthur.getCondition());
    }

    @Test
    public void testSetName() {
        Arthur arthur = new Arthur("Arthur", "happy");
        arthur.setName("Arthur Dent");
        assertEquals("Arthur Dent", arthur.getName());
    }

    @Test
    public void testSay() {
        // Проверяем, что метод say не выбрасывает исключений
        Arthur arthur = new Arthur("Arthur", "confused");
        arthur.say(); // просто вызов
    }
}