package test;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by Do Minh Toan on 6/4/2016.
 */
@RunWith(Theories.class)
public class TheoryTest {
    @DataPoint
    public static String name = "Jack";

    @DataPoint
    public static String age = "18";

    @Theory
    public void sanity(String abc, String age) {
        System.out.println("Sanity check " + age);
    }
}
