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

    }

    void assignID(MaterialButton button, int id){
        button = findViewById(id);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}