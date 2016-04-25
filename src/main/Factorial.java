package main;

/**
 * Created by Do Minh Toan on 6/4/2016.
 */
public class Factorial {
    public long factorial(long number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
