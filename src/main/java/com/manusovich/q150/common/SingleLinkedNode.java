package com.manusovich.q150.common;

/**
 * Created by Alex Manusovich on 4/4/15.
 */
public class SingleLinkedNode<T> {
    private T value;
    private SingleLinkedNode<T> next;

    public SingleLinkedNode(T value) {
        this.value = value;
    }

    public SingleLinkedNode(T value, SingleLinkedNode<T> parent) {
        this.value = value;
        parent.setNext(this);
    }

    public SingleLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(SingleLinkedNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
