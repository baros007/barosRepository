package demo1.baros.calculator;

/**
 * Created by sony on 11/5/2559.
 */
public class Calculator {

    public double addplus(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public double minus(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public double kun(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public double divide(double operand1, double operand2) {
        if(operand2 == 0){
            throw new DivideByZeroException();
           }
        return operand1 / operand2;
    }
}
