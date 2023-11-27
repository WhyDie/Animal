package org.example;

import java.util.LinkedList;

public class MyLinkedList {
    private int size;
    private Element first;
    private Element last;

    public MyLinkedList() { }

    public void add(Integer pos) {
        Element newElement = new Element(pos);

        if (size == 0) {
            first = newElement;
            last = newElement;
        } else {
            last.setNext(newElement);
            last = newElement;
        }

        size++;
    }

    public void add(int index, Integer element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Element newElement = new Element(element);
        if (index == 0) {
            newElement.setNext(first);
            first = newElement;
        }
        size++;
    }

    public void addFirst(Integer pos) {
        add(0, pos);
    }

    public void addLast(Integer pos) {
        add(size, pos);
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Element current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getElement();
    }

    public Integer getFirst() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        return first.getElement();
    }

    public Integer getLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        return last.getElement();
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Element removedElement;
        if (index == 0) {
            removedElement = first;
            first = first.getNext();
            if (size == 1) {
                last = null;
            }
        } else {
            Element prevElement = getElement(index - 1);
            removedElement = prevElement.getNext();
            prevElement.setNext(removedElement.getNext());
            if (index == size - 1) {
                last = prevElement;
            }
        }
        size--;
        return removedElement.getElement();
    }

    public Integer removeFirst() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        return remove(0);
    }

    public Integer removeLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        return remove(size - 1);
    }

    public void set(int index, Integer pos) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        getElement(index).setElement(pos);
    }
    public int size() {
        return size;
    }
    public int indexOf(Integer pos) {
        Element current = first;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(pos)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    private Element getElement(int index) {
        Element current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
