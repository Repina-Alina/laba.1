public class Container<T> {
    private Node<T> head;
    private int size;

    /**
     *Класс узла односвязного списка
     * @param <T> элемент класса
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     *Контейнер класса
     */
    public Container() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Добавление элемента в контейнер
     * @param item элемент для добавления
     */
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * Получение элемента по индексу
     * @param index индекс элемнта
     * @return элемент по индексу
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     *Удаление элемента по индексу
     * @param index индекс элемнта для удаления
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    /**
     * Получение размера контейнера
     * @return размер контейнера
     */
    public int size() {
        return size;
    }
}