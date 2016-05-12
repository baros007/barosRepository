package demo1.baros.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double op1;
    private double op2;
    private double expectedResult;

    @Test
    public void sub(){
        Calculator calculator = new Calculator();
        assertEquals(this.expectedResult,
                     calculator.addplus(this.op1, this.op2));
    }

    public CalculatorSubTest(double op1, double op2, double expectedResult) {
        this.op1 = op1;
        this.op2 = op2;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1, 2, 3.0},
                {4, 2, 6.0},
                {1, 9, 10.0},
        });
    }
}
