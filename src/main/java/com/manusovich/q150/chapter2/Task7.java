package com.manusovich.q150.chapter2;

/**
 * Implement a function to check if a linked list i a palindrome
 * <p>
 * * Created by Alex Manusovich on 4/4/15.
 */
public class Task7 {

    public static void main(String... p) {
        SingleLinkedNode<Integer> root =
                ListUtils.createSingleLinkedList(new Integer[]{1, 2, 1, 4, 5, 3, 3, 5, 4, 3, 2, 1});
        ListUtils.printLinkedList(root);
        System.out.println("Palindrome: " + checkPalindrome(root));
    }

    public static <T> boolean checkPalindrome(SingleLinkedNode<T> root) {
        // find next element after middle in the list
        int count = 0;
        SingleLinkedNode<T> slow = root;
        SingleLinkedNode<T> fast = root;
        while (fast != null) {
            if (fast.getNext() != null) {
                fast = fast.getNext().getNext();
                slow = slow.getNext();
                count += 2;
            } else {
                fast = fast.getNext();
                count++;
            }
        }

        if (count == 1) {
            return true;
        }

        if (count % 2 > 0) {
            slow = slow.getNext();
        }

        System.out.println("Next after middle = " + slow);
        SingleLinkedNode[] toCheck = {root};
        return check(slow, toCheck);
    }

    public static <T> boolean check(SingleLinkedNode<T> current, SingleLinkedNode[] toCheck) {
        boolean result = true;
        if (current.getNext() != null) {
            if (!check(current.getNext(), toCheck)) {
                result = false; // not returning here because want to log values
            }
        }
        if (current.getValue() == null || !current.getValue().equals(toCheck[0].getValue())) {
            result = false;
        }
        System.out.println("c = " + current + " t " + toCheck[0]);
        toCheck[0] = toCheck[0].getNext();
        return result;
    }

}
