package com.algorithm.demo.java7;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Trang Truong(sgtt003) on 6/7/2016.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            arr[a0] = n;
        }

        for (Integer i : arr) {
            int count = 0;
            while(i > 0) {
                int el = i % 10;
                if (el != 0 && i % el == 0) count++;
                i /= 10;
            }
            System.out.println(count);
        }
    }
}
