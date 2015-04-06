package com.manusovich.q150.chapter2;

import com.manusovich.q150.common.ListUtils;
import com.manusovich.q150.common.SingleLinkedNode;

/**
 * Remove duplicates from unsorted single linked list
 * *
 * Created by Alex Manusovich on 4/4/15.
 */
public class Task1 {

    public static void main(String... p) {
        SingleLinkedNode<Integer> root = ListUtils.createSingleLinkedList(
                new Integer[]{0, 0, 0, 10, 20, 11, 10, 10, 30, 4, 32, 5, 3, 4, 4, 4});
        ListUtils.printLinkedList(root);

        SingleLinkedNode<Integer> current = root;
        while (current != null) {

            if (current.getNext() != null) {
                SingleLinkedNode<Integer> finderPrev = current;
                SingleLinkedNode<Integer> finder = current.getNext();
                while (finder != null) {
                    if (finder.getValue() != null && finder.getValue().equals(current.getValue())) {
                        finderPrev.setNext(finder.getNext());
                    } else {
                        finderPrev = finder;
                    }
                    finder = finder.getNext();
                }
            }

            current = current.getNext();
        }
        ListUtils.printLinkedList(root);
    }


}
