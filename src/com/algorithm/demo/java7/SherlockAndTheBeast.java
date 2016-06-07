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
        if (t < 1 || t > 20) return;

        int[] a = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if (n < 1 || n > 100000) return;
            a[a0] = n;
        }

        String three5 = "555";
        String five3 = "33333";
        for (int n : a) {
            String result = "";
            if (n < 3) {
                result = "-1";
            } else if (n % 3 == 0) {
                result = new String(new char[n]).replace('\0', '5');
            } else if (n % 5 == 0) {
                result = new String(new char[n]).replace('\0', '3');
            } else {
                boolean found = false;
                int max5s = n / 3;
                int current5s = 0;
                int complementOf5s = 0;
                int max3s = n / 5;
                int current3s = 0;
                int complementOf3s = 0;
                for (int i = 1; i <= max5s; i++) {
                    if ((n - i * 3) % 5 == 0) {
                        current5s = i;
                        complementOf5s = (n - i * 3) / 5;
                        found = true;
                    }
                }
                if (found) {
                    result = new String(new char[current5s*3]).replace('\0', '5');
                    if (complementOf5s > 0) {
                        result += new String(new char[complementOf5s*5]).replace('\0', '3');
                    }
                }

                for (int i = 1; i <= max3s; i++) {
                    if ((n - i * 5) % 3 == 0) {
                        current3s = i;
                        complementOf3s = (n - i * 5) / 3;
                        found = true;
                    }
                }
                if (found) {
                    if (complementOf3s > 0) {
                        result = new String(new char[complementOf3s*3]).replace('\0', '5');
                    }
                    result += new String(new char[current3s*5]).replace('\0', '3');
                }
            }

            if (result.isEmpty()) {
                result = "-1";
            }

            System.out.println(result);
        }
    }
}
