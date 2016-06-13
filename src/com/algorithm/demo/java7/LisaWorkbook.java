package com.algorithm.demo.java7;

import java.util.Scanner;

/**
 * Created by Trang Truong(sgtt003) on 6/13/2016.
 */
public class LisaWorkbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int n = Integer.valueOf(str1.split(" ")[0]);
        int k = Integer.valueOf(str1.split(" ")[1]);
        String[] arr = str2.split(" ");

        int specialProbs = 0;
        int currentPage = 0;
        for (String str : arr) {
            int probs = Integer.valueOf(str);
            int pages, probPerPage;

            if (probs < k) {
                pages = 1;
                probPerPage = probs;
            } else {
                pages = probs/k;
                probPerPage = k;
            }

            int currentPages = currentPage + pages;
            int prob = 1;
            while (currentPage <= currentPages) {
                currentPage++;
                for (int j=1; j <= probPerPage; j++, prob++) {
                    if (prob == currentPage) {
                        specialProbs++;
                    }
                }
                if (currentPage == currentPages) {
                    if (probPerPage < k) {
                        break;
                    }
                    if ( probs%k != 0) {
                        currentPages++;
                        probPerPage = probs%k;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(specialProbs);
    }
}
