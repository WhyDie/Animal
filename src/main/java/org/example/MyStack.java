package org.example;

public class MyStack {
    private MyLinkedList list;

    public MyStack() {
        this.list = new MyLinkedList();
    }

    public void push(Integer element) {
        list.addFirst(element);
    }

    public Integer pop() {
        return list.removeFirst();
    }
}