package com.hackerrange.search.missingnumbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Trang Truong(sgtt003) on 6/15/2016.
 */
public class Solution {
    static String A = "203 204 205 206 207 208 203 204 205 206";
    static String B = "203 204 204 205 206 207 205 208 203 206 205 206 204";
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int[] count = new int[101];
        for(int i=0;i<101;++i)
        {
            arr[i]=-100001;
            count[i]=0;
        }
        int n = sc.nextInt();
        int val = 0;

        for(int i=0;i<n;++i)
        {
            val = sc.nextInt();
            arr[val%101]=val;
            ++count[val%101];
        }

        int m = sc.nextInt();

        for(int i=0;i<m;++i)
        {
            val = sc.nextInt();
            arr[val%101]=val;
            --count[val%101];
            if(count[val%101]==0)
                arr[val%101]=-100001;
        }


        Arrays.sort(arr);
        for(int i=0;i<101;++i)
        {
            if(arr[i]!=-100001)
                System.out.print(arr[i]+" ");
        }
    }

}
