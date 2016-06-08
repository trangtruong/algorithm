package com.algorithm.demo.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Trang Truong(sgtt003) on 6/7/2016.
 */
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String input = in.nextLine();
        String[] strings = input.split("\\s+");
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int num = Integer.parseInt(strings[i]);
            arr[i] = num;
        }

        Arrays.sort(arr);
        cutTheSticks(arr, arr[0]);
    }

    private static void cutTheSticks(int[] arr, int cut) {
        int sticks = 0;
        int index = 0;
        int[] newArr = new int[arr.length];
        for (int i : arr) {
            if (i ==0) break;
            sticks++;

            int newCut = i - cut;
            if (newCut == 0) continue;
            newArr[index] = newCut;
            index++;
        }

        if (sticks == 0) return;
        System.out.println(sticks);
        cutTheSticks(newArr, newArr[0]);
    }
}
