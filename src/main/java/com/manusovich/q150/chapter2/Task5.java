package com.manusovich.q150.chapter2;

/**
 * Given two numbers represented by two lists, write a function that returns sum list. The sum list is list representation of addition of two input numbers.
 * <p>
 * Example 1
 * <p>
 * Input:
 * First List: 5->6->3  // represents number 365
 * Second List: 8->4->2 //  represents number 248
 * Output
 * Resultant list: 3->1->6  // represents number 613
 * Example 2
 * <p>
 * Input:
 * First List: 7->5->9->4->6  // represents number 64957
 * Second List: 8->4 //  represents number 48
 * Output
 * Resultant list: 5->0->0->5->6  // represents number 65005
 * <p>
 * * Created by Alex Manusovich on 4/4/15.
 */
public class Task5 {

    public static void main(String... p) {
        SingleLinkedNode<Integer> rootOne =
                ListUtils.createSingleLinkedList(new Integer[]{7, 5, 9, 4, 6});
        SingleLinkedNode<Integer> rootTwo =
                ListUtils.createSingleLinkedList(new Integer[]{8, 4});
        ListUtils.printLinkedList(rootOne);
        ListUtils.printLinkedList(rootTwo);
        ListUtils.printLinkedList(sum(rootOne, rootTwo));
    }

    public static SingleLinkedNode<Integer> sum(
            SingleLinkedNode<Integer> rootOne, SingleLinkedNode<Integer> rootTwo) {
        SingleLinkedNode<Integer> root = null, current = null;

        SingleLinkedNode<Integer> one = rootOne;
        SingleLinkedNode<Integer> two = rootTwo;
        int rest = 0;
        while (one != null || two != null || rest > 0) {

            int sum = rest;
            if (one != null) {
                sum += one.getValue();
                one = one.getNext();
            }
            if (two != null) {
                sum += two.getValue();
                two = two.getNext();
            }

            if (sum > 9) {
                rest = 1;
                sum = sum - 10;
            } else {
                rest = 0;
            }

            if (root == null) {
                root = new SingleLinkedNode<>(sum);
                current = root;
            } else {
                SingleLinkedNode<Integer> node = new SingleLinkedNode<>(sum);
                current.setNext(node);
                current = node;
            }

        }

        return root;
    }

}
