package com.manusovich.q150.common.test;

/**
 * Created by Alex Manusovich on 4/5/15.
 */
public class TailRecursionOptimizationTest {
    private static int loop(int i) {
        return loop(i);
    }

    public static void main(String[] args) {
        loop(0);
    }
}
