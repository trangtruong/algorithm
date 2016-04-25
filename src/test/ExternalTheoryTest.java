package test;

import main.Adder;
import org.junit.Assert;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by Do Minh Toan on 6/4/2016.
 */
@RunWith(Theories.class)
public class ExternalTheoryTest {
    @Theory
    public void adds_numbers(
            @ParametersSuppliedBy(NumberSupplier.class) Number num1,
            @ParametersSuppliedBy(NumberSupplier.class) Number num2) {
        Adder	anAdder	=	new Adder();
        double	expectedSum	=	num1.doubleValue()+num2.doubleValue();
        double	actualResult	=	(Double)anAdder.add(num1,	num2);
        Assert.assertEquals(actualResult,	expectedSum,	0.01);
    }
}
