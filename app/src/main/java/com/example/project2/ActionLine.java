package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActionLine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
    }

    public void lineAndPoint(View view){
        startActivity(new Intent(this, ActivityLine6.class));
    }

    public void lineAndLine(View view){
        startActivity(new Intent(this, ActivityLine8.class));
    }
}