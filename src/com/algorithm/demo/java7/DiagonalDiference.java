package com.algorithm.demo.java7;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Trang Truong(sgtt003) on 6/3/2016.
 */
public class DiagonalDiference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0;
        for (int i = 0, j = a.length-1; i < a.length; i++, j--) {
            sum1 += a[i][i];
            sum2 += a[i][j];
        }

        System.out.println(Math.abs(sum1-sum2));
    }
}
