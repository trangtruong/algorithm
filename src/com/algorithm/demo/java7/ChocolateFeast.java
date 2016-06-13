package com.algorithm.demo.java7;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Trang Truong(sgtt003) on 6/8/2016.
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String[] arr = new String[t];
        for(int a0 = 0; a0 < t; a0++){
            String ncm = in.nextLine();
            arr[a0] = ncm;
        }

        for(String ncm : arr) {
            String[] input = ncm.split("\\s+");
            int n = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            int m = Integer.parseInt(input[2]);

            int buy = n / c;
            int free = getFree(buy, m, 0);
            System.out.println(buy + free);
        }
    }

    private static int getFree(int k, int m, int result) {
        if (k < m) return result;

        int left = k % m;
        k = k/m;
        result += k;
        k += left;
        return getFree(k,m, result);
    }

    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
