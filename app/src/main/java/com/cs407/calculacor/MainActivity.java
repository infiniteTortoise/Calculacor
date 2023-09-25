package com.cs407.calculacor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1, editTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.myTextField1);
        editTextNumber2 = findViewById(R.id.myTextField2);

        Button add = findViewById(R.id.add);
        Button subtract = findViewById(R.id.subtract);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int num1 = Integer.parseInt(editTextNumber1.getText().toString());
//                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
//                int result = num1 + num2;
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = num1 + num2;
                sendResultToResultActivity(result);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = num1 - num2;
                sendResultToResultActivity(result);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = num1 * num2;
                sendResultToResultActivity(result);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                if(num2 == 0) {
                    Toast.makeText(MainActivity.this, "dividend cannot be 0", Toast.LENGTH_SHORT).show();
                } else {
                    double result = num1 / num2;
                    sendResultToResultActivity(result);
                }

            }
        });



    }

    private void sendResultToResultActivity(double result) {
        Intent intent = new Intent(MainActivity.this, Result.class);
        intent.putExtra("result", Double.toString(result));
        startActivity(intent);
    }
}
