package com.algorithm.demo.java7;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Trang Truong(sgtt003) on 6/7/2016.
 */
public class SquareNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String[] arr = new String[t];
        StringBuilder sb = new StringBuilder();
        for(int a0 = 0; a0 < t; a0++) {
            String input = in.nextLine();
            arr[a0] = input;
        }

        for (String range : arr) {
            String[] arrTemp = range.split(" ");
            int from = Integer.parseInt(arrTemp[0]);
            int to = Integer.parseInt(arrTemp[1]);

            int count = countSquareNumber(from, to);
            System.out.println(count);
        }
    }

    private static int countSquareNumber(int a, int b) {
        int startSqrt, endSqrt;
        startSqrt = isPerfectSquare(a) ? (int)(Math.floor(Math.sqrt(a)) - 1) : (int)Math.floor(Math.sqrt(a));
        endSqrt = (int)Math.floor(Math.sqrt(b));
        return endSqrt - startSqrt;
    }

    public static boolean isPerfectSquare(long n) {
        if (n < 0)
            return false;

        long tst = (long)(Math.sqrt(n) + 0.5);
        return tst*tst == n;
    }
}
