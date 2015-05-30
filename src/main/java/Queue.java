/**
 * Очередь: FIFO = First Input First Output
 */
public class Queue<T> {
    /**
     * Добавить в конец очереди
     *
     * @param v значение
     */
    public void put(T v) {
        // TODO: реализовать
    }

    /**
     * Взять из начала очереди
     *
     * @return значение
     */
    public T get() {
        // TODO: реализовать
        return null;
    }

    /**
     * Элемент очереди
     */
    class Element {
        T value;
        Element next;
    }
}
