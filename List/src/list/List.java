/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Гамаюнов Иван
 */


// Класс List представляет собой список на основе узлов.
class List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Добавляет элемент в конец списка.
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    // Добавляет элемент в начало списка.
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    // Удаляет элемент из конца списка.
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        T data = tail.getData();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            current.setNext(null);
            tail = current;
        }
        size--;
        return data;
    }

    // Удаляет элемент из начала списка.
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T data = head.getData();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
        size--;
        return data;
    }

    // Возвращает элемент по индексу.
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // Устанавливает элемент по индексу.
    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setData(data);
    }

    // Удаляет элемент по индексу.
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T data;
        if (index == 0) {
            data = removeFirst();
        } else if (index == size - 1) {
            data = removeLast();
        } else {
            Node<T> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            Node<T> current = previous.getNext();
            data = current.getData();
            previous.setNext(current.getNext());
            size--;
        }
        return data;
    }

    // Возвращает размер списка.
    public int size() {
        return size;
    }

    // Проверяет, пуст ли список.
    public boolean isEmpty() {
        return size == 0;
    }

    // Очищает список.
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Возвращает строковое представление списка.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}

