import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование стека
 */
public class StackTest {

    /**
     * Стек с целыми числами
     */
    @Test
    public void testIntStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
    }

    /**
     * Стек со строками
     */
    @Test
    public void testStringStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("world");
        assertEquals("world", stack.pop());
        assertEquals("Hello", stack.pop());
    }
}
