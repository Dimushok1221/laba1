package com.dimushok.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go_to_act_2(View v){
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("secName", "Кошелев");
        startActivity(intent);
    }
}