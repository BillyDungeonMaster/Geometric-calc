package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTriangleClick(View view){
        startActivity(new Intent(this, ActionTriangle.class));
    }

    public void onVectorClick(View view){
        startActivity(new Intent(this, ActionVec.class));
    }

    public void toLine(View view){
        startActivity(new Intent(this, ActionLine.class));
    }
}
