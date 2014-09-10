package com.manusovich.q150.chapter1;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * can not use additional data structures?
 * <p>
 * Created by Alex Manusovich on 9/10/14.
 */
public class Task1 {

    public static boolean isAllUnique1(final String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        HashSet<Character> hashSet = new HashSet<>();
        int c = 0;
        for (; c < input.length(); c++) {
            hashSet.add(input.charAt(c));
        }
        return hashSet.size() == c;
    }

    public static boolean isAllUnique2(final String input) {
        if (input == null || input.length() == 0) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            for (int k = 0; k < input.length(); k++) {
                if (i != k && input.charAt(i) == input.charAt(k)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAllUnique(final String input) {
        return isAllUnique1(input) && isAllUnique2(input);
    }

}
