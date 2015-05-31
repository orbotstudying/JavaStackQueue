import java.util.EmptyStackException;


/**
 * Стек: LIFO = Last Input First Output
 */
public class Stack<T> {
    private Element head;
    private Element tail;

    public Stack() {
        head = null;
        tail = null;
    }

    /**
     * Добавить на вершину стека
     *
     * @param v значение
     */
    public void push(T v) {
        Element newElem = new Element(v);
        newElem.prev = tail;
        if(isEmpty()) {
            head = newElem;
        }
        tail = newElem;
    }

    /**
     * Получить значение с вершины
     *
     * @return значение
     */
    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            T returnedValue = tail.value;
            tail = tail.prev;
            return returnedValue;
        }
    }

    /**
     * Получить значение с вершины<br />
     * не удаляя его
     *
     * @return значение
     */
    public T peek() {
        return tail.value;
    }

    /**
     * Метод проверяет, пустой ли стэк
     *
     * @return true/false
     */
    public boolean isEmpty() {
        return tail == null && head == null;
    }

    /**
     * Элемент стека
     */
    class Element {
        Element(T v) {
            value = v;
        }
        T value;
        Element prev;
    }
}
