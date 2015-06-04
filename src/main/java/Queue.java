import java.util.NoSuchElementException;

/**
 * Очередь: FIFO = First Input First Output
 */
public class Queue<T> {
    private Element head;
    private Element tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Добавить в конец очереди
     *
     * @param v значение
     */
    public void put(T v) {
        Element newElem = new Element(v);
        if(isEmpty()) {
            head = newElem;
            tail = newElem;
        } else {
            tail.next = newElem;
            tail = newElem;
        }
    }

    /**
     * Взять из начала очереди
     *
     * @return значение
     */
    public T get() {
        if(isEmpty()) {
            throw new NoSuchElementException("Пустая очередь");
        } else {
            T returnedValue = head.value;
            head = head.next;
            return returnedValue;
        }
    }

    /**
     * Метод проверяет, пустая ли очередь
     *
     * @return true/false
     */
    public boolean isEmpty() {
        return tail == null && head == null;
    }

    /**
     * Элемент очереди
     */
    class Element {
        Element(T v) {
            value = v;
        }
        T value;
        Element next;
    }
}
