package com.purecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView calculator_equation, calculator_result;
    DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator_result = findViewById(R.id.calculator_result);
        calculator_equation = findViewById(R.id.calculator_equation);

        assignID(R.id.button_ac);
        assignID(R.id.button_bracket_open);
        assignID(R.id.button_bracket_close);
        assignID(R.id.button_divider);
        assignID(R.id.button_multiplier);
        assignID(R.id.button_minus);
        assignID(R.id.button_plus);
        assignID(R.id.button_equal);
        assignID(R.id.button_comma);
        assignID(R.id.button_9);
        assignID(R.id.button_8);
        assignID(R.id.button_7);
        assignID(R.id.button_6);
        assignID(R.id.button_5);
        assignID(R.id.button_4);
        assignID(R.id.button_3);
        assignID(R.id.button_2);
        assignID(R.id.button_1);
        assignID(R.id.button_0);

        decimalFormatSymbols.setDecimalSeparator('.');
    }

    void assignID(int id) {
        MaterialButton btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();

        if (buttonText.equals("AC")) {
            calculator_result.setText("0");
            calculator_equation.setText("");

            return;
        }

        if (buttonText.equals("=")) {
            String finalResult = getResult(calculator_equation.getText().toString());

            if (!finalResult.equals("Err")) {
                calculator_result.setText(finalResult);
            }

            calculator_result.setText(finalResult);
            calculator_equation.setText(finalResult);

            return;
        }

        String toCalculate = calculator_equation.getText().toString() + buttonText;
        calculator_equation.setText(toCalculate);

    }

    String getResult(String equation) {
        Expression expression = new ExpressionBuilder(equation).build();
        try {
            Double result = expression.evaluate();

            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);

            String finalResult = decimalFormat.format(result);
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0","");
                return finalResult;
            }
            return finalResult;
        } catch (Exception e) {
            return "Err";
        }

    }
}