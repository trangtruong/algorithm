package com.algorithm.demo.java7;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Trang Truong(sgtt003) on 6/3/2016.
 */
public class PlusMinus {
    enum NUMERIC {POSITIVE, NEGATIVE, ZERORES};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        Map<NUMERIC, Float> result = new HashMap<>();
        result.put(NUMERIC.POSITIVE, 0.f);
        result.put(NUMERIC.NEGATIVE, 0.f);
        result.put(NUMERIC.ZERORES, 0.f);
        for(int arr_i=0; arr_i < n; arr_i++){
            int input = in.nextInt();
            arr[arr_i] = input;
            if (input > 0) {
                float count = result.get(NUMERIC.POSITIVE) + 1;
                result.put(NUMERIC.POSITIVE, count);
            } else if (input < 0) {
                float count = result.get(NUMERIC.NEGATIVE) + 1;
                result.put(NUMERIC.NEGATIVE, count);
            } else {
                float count = result.get(NUMERIC.ZERORES) + 1;
                result.put(NUMERIC.ZERORES, count);
            }
        }

        System.out.println(result.get(NUMERIC.POSITIVE)/arr.length);
        System.out.println(result.get(NUMERIC.NEGATIVE)/arr.length);
        System.out.println(result.get(NUMERIC.ZERORES)/arr.length);
    }
}
