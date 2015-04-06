package com.manusovich.q150.chapter2;

import com.manusovich.q150.common.ListUtils;
import com.manusovich.q150.common.SingleLinkedNode;

/**
 * Implement an algorithm to find the kth to last element of singly linked list
 *
 * Created by Alex Manusovich on 4/4/15.
 */
public class Task2 {

    public static void main(String... p) {
        SingleLinkedNode<Integer> root = ListUtils.createSingleLinkedList(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListUtils.printLinkedList(root);

        Result<Integer> result = new Result<>(10);
        findLastKFromTheEndRecursive(root, result);
        System.out.println("result recursive = " + result.node);
        System.out.println("result = " + findLastKFromTheEnd(root, 10));
    }


    public static <T> void findLastKFromTheEndRecursive(SingleLinkedNode<T> node, Result<T> result) {
        int position = result.listSize; // save current level in stack
        result.listSize++;
        if (node.getNext() != null) {
            findLastKFromTheEndRecursive(node.getNext(), result);
        }
        if (position == result.listSize - result.k) {
            result.node = node;
        }
    }

    public static <T> SingleLinkedNode<T> findLastKFromTheEnd(SingleLinkedNode<T> node, int k) {
        int count = 1;
        {
            SingleLinkedNode<T> current = node;
            while (current.getNext() != null) {
                current = current.getNext();
                count++;
            }
        }
        {
            int pos = 0;
            SingleLinkedNode<T> current = node;
            while (pos < count - k) {
                pos++;
                current = current.getNext();
            }
            return current;
        }
    }

    static class Result<T> {
        int listSize = 0;
        int k;
        SingleLinkedNode<T> node;

        public Result(int k) {
            this.k = k;
        }
    }
}
