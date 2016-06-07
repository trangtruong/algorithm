package com.algorithm.demo.java7;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Trang Truong(sgtt003) on 6/3/2016.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int input = in.nextInt();
            arr[a0] = input;
        }

        int start = 1;
        for (int year : arr) {
            int result = start;
            if (year < 1) {
                System.out.println(result);
                continue;
            }

            for (int i = 1; i <= year; i ++) {
                // summer
                if (i % 2 == 0) {
                    result += 1;
                } else { //spring
                    result *= 2;
                }
            }

            System.out.println(result);
        }
    }
}
