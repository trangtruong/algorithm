package com.algorithm.demo.insertionsort;

/**
 * Created by Trang Truong(sgtt003) on 6/2/2016.
 */
public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] a = {5,2, 4, 6, 1, 3};
        int[] arr = {31, 41, 59, 26, 41, 58};
        int key;
        for (int j = 1; j < arr.length; j++) {
            key = arr[j];
            int i = j-1;

            while (i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
