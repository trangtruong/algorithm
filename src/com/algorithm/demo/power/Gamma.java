package com.algorithm.demo.power;

/**
 * Created by Trang Truong(sgtt003) on 6/3/2016.
 */
public class Gamma {
    public static void main(String[] args) {
        System.out.println(gamma());
    }
    public static double gamma ()
    {
        double result = 0;
        for (int i = 1; i <= 500000; ++i)
            result += 1./i - Math.log ((i + 1.)/i);
        return result;
    }
}
