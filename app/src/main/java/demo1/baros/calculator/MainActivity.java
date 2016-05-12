package demo1.baros.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CalculatorListener{

    TextView txtResult;
    EditText edtOp1;
    EditText edtOp2;
    MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txt_result);
        edtOp1    = (EditText) findViewById(R.id.text_op1);
        edtOp2    = (EditText) findViewById(R.id.text_op2);

        mainController = new MainController();
        mainController.setListener(this);
    }

    public void onAdd(View view) {
        Calculator calculator = new Calculator();
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
//        double res = calculator.addplus(op1, op2);
//
//        txtResult.setText( String.valueOf(res) );
        mainController.add(op1, op2);
    }

    public void onSub(View view) {
        Calculator calculator = new Calculator();
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
//        double res = calculator.minus(op1, op2);
//
//        txtResult.setText( String.valueOf(res) );
        mainController.sub(op1, op2);
    }

    public void onSuccess(String result){
        txtResult.setText(String.valueOf(result));
    }

    public void onMul(View view) {
        Calculator calculator = new Calculator();
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
        double res = calculator.kun(op1, op2);

        txtResult.setText( String.valueOf(res) );
    }

    public void onDiv(View view) {
        Calculator calculator = new Calculator();
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
        double res = calculator.divide(op1, op2);

        txtResult.setText( String.valueOf(res) );
    }

}
