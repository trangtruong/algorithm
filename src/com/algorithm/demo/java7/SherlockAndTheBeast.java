package com.algorithm.demo.java7;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Trang Truong(sgtt003) on 6/3/2016.
 */
public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            arr[a0] = n;
        }

        for (int i : arr) {
            System.out.println(abc(i));
        }
    }

    private static String abc(int n) {
        if (n < 3) {
            return "-1";
        }

        int max5s = n / 3;
        int max3s = n / 5;
        char[] charArray = new char[n];

        for (int i = max5s; i >= 1; i--) {
            if ((n - i * 3) % 5 == 0) {
                Arrays.fill(charArray, 0, i * 3, '5');

                int complementOf5s = (n - i * 3) / 5;
                if (complementOf5s >= 1) {
                    Arrays.fill(charArray, i * 3, n, '3');
                }

                return new String(charArray);
            }
        }

        for (int i = max3s; i >= 1; i--) {
            if ((n - i * 5) % 3 == 0) {

                int complementOf3s = (n - i * 5) / 3;
                if (complementOf3s >= 1) {
                    Arrays.fill(charArray, 0, complementOf3s * 3, '5');
                    Arrays.fill(charArray, complementOf3s * 3, n, '3');
                } else {
                    Arrays.fill(charArray, 0, i * 5, '3');
                }

                return new String(charArray);
            }
        }

        return "-1";
    }
}
