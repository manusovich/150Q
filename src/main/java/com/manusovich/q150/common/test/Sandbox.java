package com.manusovich.q150.common.test;

/**
 * Created by Alex Manusovich on 4/6/15.
 */
public class Sandbox {
    public static void main(String...p) {
        {
            int k = 4;
            System.out.println(k);
        }
        {
            int l = 1;
            System.out.println(1);
        }
        int k = 1;
        for (int i = 1000; i < 1005+k; i+=++k) {
            System.out.println(i);
        }
    }
}
