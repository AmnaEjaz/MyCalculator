package com.example.amnaejaz.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.screen);
    }
    public void onclick1(View view) {
        editText.setText(editText.getText() + "1");
    }

    public void onclick2(View view) {
        editText.setText(editText.getText() + "2");
    }

    public void onclick3(View view) {
        editText.setText(editText.getText() + "3");
    }

    public void onclick4(View view) {
        editText.setText(editText.getText() + "4");
    }

    public void onclick5(View view) {
        editText.setText(editText.getText() + "5");
    }

    public void onclick6(View view) {
        editText.setText(editText.getText() + "6");
    }

    public void onclick7(View view) {
        editText.setText(editText.getText() + "7");
    }

    public void onclick8(View view) {
        editText.setText(editText.getText() + "8");
    }

    public void onclick9(View view) {
        editText.setText(editText.getText() + "9");
    }

    public void onclick0(View view) {
        editText.setText(editText.getText() + "0");
    }

    public void clear(View view) {
        editText.setText("");
    }

    public void toadd(View view) {
        editText.setText(editText.getText() + "+");

    }

    public void tosubtract(View view) {


        editText.setText(editText.getText() + "-");

    }

    public void todivide(View view) {


        editText.setText(editText.getText() + "/");

    }

    public void tomultiply(View view) {


        editText.setText(editText.getText() + "*");

    }


    public void equals(View view) {
        String op = editText.getText().toString();
        Expression expression = new ExpressionBuilder(op).build();
        double result;
        result = expression.evaluate();
        editText.setText(Double.toString(result));

    }
}
