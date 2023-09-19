package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView calculator_equation, calculator_result;
    MaterialButton button_ac, button_bracket_open, button_bracket_close, button_divider, button_multiplier, button_minus, button_plus, button_equal, button_comma;
    MaterialButton button_9, button_8, button_7, button_6, button_5, button_4, button_3, button_2, button_1, button_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator_result = findViewById(R.id.calculator_result);
        calculator_equation = findViewById(R.id.calculator_equation);

        assignID(button_ac, R.id.button_ac);
        assignID(button_bracket_open, R.id.button_bracket_open);
        assignID(button_bracket_close, R.id.button_bracket_close);
        assignID(button_divider, R.id.button_divider);
        assignID(button_multiplier, R.id.button_multiplier);
        assignID(button_minus, R.id.button_minus);
        assignID(button_plus, R.id.button_plus);
        assignID(button_equal, R.id.button_equal);
        assignID(button_comma, R.id.button_comma);
        assignID(button_9, R.id.button_9);
        assignID(button_8, R.id.button_8);
        assignID(button_7, R.id.button_7);
        assignID(button_6, R.id.button_6);
        assignID(button_5, R.id.button_5);
        assignID(button_4, R.id.button_4);
        assignID(button_3, R.id.button_3);
        assignID(button_2, R.id.button_2);
        assignID(button_1, R.id.button_1);
        assignID(button_0, R.id.button_0);

    }

    void assignID(MaterialButton btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}