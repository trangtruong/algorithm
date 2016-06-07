package com.algorithm.demo.power;

/**
 * Created by Trang Truong(sgtt003) on 6/3/2016.
 */
public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    public static int power (int x, int n)
    {
        if (n == 0)
            return 1;
        else if (n % 2 == 0) // n is even
            return power (x * x, n / 2);
            // n is odd
        else {
            int a =  power (x * x, n / 2);
            return x * a;
        }
    }
}
