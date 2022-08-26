package com.example.calculatorapp11_47;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // testing
    }
    // finds sum of two numbers
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double ans = num1 + num2;

        numberSumTV.setText("" + ans);

        TextView prevEqn = findViewById(R.id.prevEquation);
        prevEqn.setText(num1 + " + " + num2 + " = " + ans);
    }
    // find product of numbers
    public void findProd(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberProdTV = findViewById(R.id.result);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double ans = num1 * num2;

        numberProdTV.setText("" + ans);

        TextView prevEqn = findViewById(R.id.prevEquation);
        prevEqn.setText(num1 + " * " + num2 + " = " + ans);
    }
    // finds difference
    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberDiffTV = findViewById(R.id.result);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double ans = num1 - num2;

        numberDiffTV.setText("" + ans);

        TextView prevEqn = findViewById(R.id.prevEquation);
        prevEqn.setText(num1 + " - " + num2 + " = " + ans);
    }
    // Divide button
    //finds quotient
    public void findQuot(View view) {
        EditText number1ET = findViewById(R.id.num1);
        EditText number2ET = findViewById(R.id.num2);
        TextView numberQuotTV = findViewById(R.id.result);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double ans = num1 / num2;

        numberQuotTV.setText("" + ans);
       // prevEquation();

        TextView prevEqn = findViewById(R.id.prevEquation);
        prevEqn.setText(num1 + "/ " + num2 + " = " + ans);


    }
    public void exponent(View view) {
        EditText base = findViewById(R.id.num1);
        EditText exp = findViewById(R.id.num2);
        TextView numberTV = findViewById(R.id.result);

        double num1 = Double.parseDouble(base.getText().toString());
        double num2 = Double.parseDouble(exp.getText().toString());
        double ans = Math.pow(num1, num2);

        numberTV.setText("" + ans);

        TextView prevEqn = findViewById(R.id.prevEquation);
        prevEqn.setText(num1 + " ^ " + num2 + " = " + ans);



    }
//    public void prevEquation(char symbol) {
//        //shows last equation typed
//        EditText number1ET = findViewById(R.id.num1);
//        EditText number2ET = findViewById(R.id.num2);
//        TextView prevEqn = findViewById(R.id.prevEquation);
//
//        double num1 = Double.parseDouble(number1ET.getText().toString());
//        double num2 = Double.parseDouble(number2ET.getText().toString());
//        numberTV.setText("" + ans);
//        prevEqn.setText(num1 + " "+symbol +" "+ num2 + " = " + ans);
//
//    }


}