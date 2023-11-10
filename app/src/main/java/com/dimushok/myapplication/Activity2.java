package com.dimushok.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = (android.widget.TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        String secName = intent.getStringExtra("secName");
        textView.setText("Переданный параметр: " + secName);
    }
}