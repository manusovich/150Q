package com.manusovich.q150.chapter2;

/**
 * Created by Alex Manusovich on 4/4/15.
 */
public class ListUtils {
    public static <T> SingleLinkedNode<T> createSingleLinkedList(T[] values) {
        SingleLinkedNode<T> root = new SingleLinkedNode<>(values[0]);

        if (values.length > 1) {
            SingleLinkedNode<T> current = root;
            for (int i = 1; i < values.length; i++) {
                current = new SingleLinkedNode<>(values[i], current);
            }
        }

        return root;
    }

    public static <T> void printLinkedList(SingleLinkedNode<T> root) {
        SingleLinkedNode<T> current = root;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static <T> SingleLinkedNode<T> findByValue(SingleLinkedNode<T> root, T value) {
        SingleLinkedNode<T> current = root;
        while (current != null) {
            if (current.getValue() != null && current.getValue().equals(value)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
}
