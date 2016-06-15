package com.hackerrange.search.missingnumbers;

/**
 * Created by sgtt003 on 1/12/2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Trang Truong
 *
 * This returns missing numbers in A[] which compared to B[].
 * Solution: keep index A, loop A and count the total occur at that index.
 */
public class MissingNumbers {
    static String A = "203 204 205 206 207 208 203 204 205 206";
    static String B = "203 204 204 205 206 207 205 208 203 206 205 206 204";
    public static void process(int n, int[] A, int m, int[] B){
        StringBuilder result = new StringBuilder();

        int indexA = 0;
        int currentMiss = 0;
        for (int indexB = 0; indexB < m; indexB++){
            if (indexA == n || B[indexB] != A[indexA]){
                if (B[indexB] != currentMiss || currentMiss == 0){
                    currentMiss = B[indexB];
                    result.append(B[indexB] + " ");
                }
            } else {
                indexA++;
            }
        }

        System.out.print(result.toString().trim());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        String valueA = in.nextLine();
        int m = Integer.valueOf(in.nextLine());
        String valueB = in.nextLine();
        in.close();

        int[] AList = convert(valueA);

        int[] BList = convert(valueB);

        process(AList.length, AList, BList.length, BList);
    }

    private static int[] convert(String value) {
        String[] strs = value.split(" ");
        int len = strs.length;
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }
        Arrays.sort(nums);
        return nums;
    }

}
