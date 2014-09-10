package com.manusovich.q150.chapter1;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * can not use additional data structures?
 * <p>
 * Created by Alex Manusovich on 9/10/14.
 */
public class Task1 {
    public static final String IN[] = {"ei9hr318r", "1", "", "howqfih", "wvfsr63g"};


    public static boolean isAllUnique1(String input) {
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


    public static boolean isAllUnique2(String input) {
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

    public static void main(String... p) {
        for (String input : IN) {
            System.out.println(String.format("1. %s = %s", input, isAllUnique1(input)));
            System.out.println(String.format("2. %s = %s", input, isAllUnique2(input)));
        }
    }
}
