package demo1.baros.calculator;

/**
 * Created by sony on 11/5/2559.
 */
public class MainController {
    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add (double op1, double op2){
        listener.onSuccess(String.valueOf(calculator.addplus(op1, op2)));
//        calculator.addplus(op1, op2);
    }

    public void sub (double op1, double op2){
//        calculator.minus(op1, op2);
        listener.onSuccess(String.valueOf(calculator.minus(op1, op2)));
    }
}
