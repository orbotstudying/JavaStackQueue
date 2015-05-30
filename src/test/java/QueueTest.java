import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование очереди
 */
public class QueueTest {

    /**
     * Очередь со строками
     */
    @Test
    public void testStringStack() {
        Queue<String> queue = new Queue<>();
        queue.put("Hello");
        queue.put("world");
        assertEquals("Hello", queue.get());
        assertEquals("world", queue.get());
    }
}
