package org.example;

public class Element {
    private Integer element;
    private Element next;

    public Element(Integer element) {
        this.element = element;
        this.next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Element next() {
        return next;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
