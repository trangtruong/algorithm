package test;


import main.Factorial;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Do Minh Toan on 6/4/2016.
 */
@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {
    @Parameterized.Parameters(name	=	"{index}:	factorial({0})={1}")
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {2, 2}
        });
    }

    public ParameterizedFactorialTest(int input, int expected) {
        this.input=input;
        this.expected = expected;
    }

    private int input;
    private int expected;

    @Test
    public void test() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(factorial.factorial(input), expected);
    }
}