package com.cs407.calculacor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String resultStr = intent.getStringExtra("result");
        textView.setText(resultStr);

    }
}

