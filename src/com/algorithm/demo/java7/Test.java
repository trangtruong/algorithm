package com.algorithm.demo.java7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trang Truong(sgtt003) on 6/7/2016.
 */
public class Test {
    public static void main(String[] args) {
        int n = 15, c= 2, m= 6;
        float buy = n/c;
        System.out.println(buy);
        float free = buy/m;
        System.out.println(buy/m);
        System.out.println(free);
        System.out.println(Math.ceil(buy/m));
    }

    private static void test() {
        List<Integer> ints = mod10(123456);
        for (Integer i : ints)
            System.out.println(i);
    }

    private static List mod10(int n) {

        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n%10);
            n/=10;
        }
        return digits;
    }
}
