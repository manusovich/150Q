package com.manusovich.q150.common.test;

import com.manusovich.q150.common.ListUtils;
import com.manusovich.q150.common.SingleLinkedNode;

import java.util.ArrayList;

/**
 * Let's check what is more efficient to make reverse iteration for single linked list - storage or recursive
 * *
 * Created by Alex Manusovich on 4/5/15.
 */
public class RecursionVsStorage {
    public static final int SHORT_SLEEP = 10 * 1000;
    public static final int LONG_SLEEP = 100 * 1000;

    public static void main(String... p) {

        SingleLinkedNode<Integer> root = create();
//        ListUtils.printLinkedList(root);
        sleep(SHORT_SLEEP);

        recursion(root);
//        storage(root);
    }

    private static SingleLinkedNode<Integer> create() {
        SingleLinkedNode<Integer> root = new SingleLinkedNode<>(-1);
        SingleLinkedNode<Integer> current = root;
        for (int i = 0; i < 30000; i++) {
            current = new SingleLinkedNode<>(i, current);
        }
        return root;
    }

    public static SingleLinkedNode recursion(SingleLinkedNode current) {
        if (current.getNext() != null) {
            return recursion(current.getNext());
        }
        return current;
    }

    public static <T> void storage(SingleLinkedNode<T> root) {
        ArrayList<SingleLinkedNode<T>> list = new ArrayList<>();
        SingleLinkedNode<T> current = root;
        while (current != null) {
            list.add(current);
            current = current.getNext();
        }
        sleep(LONG_SLEEP);
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
