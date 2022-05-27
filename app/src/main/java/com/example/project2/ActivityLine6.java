package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLine6 extends AppCompatActivity {
    EditText x1, y1, x2, y2, x, y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line6);
        x1 = findViewById(R.id.point_x1);
        x2 = findViewById(R.id.point_x2);
        x = findViewById(R.id.point_x);
        y = findViewById(R.id.point_y);
        y1 = findViewById(R.id.point_y1);
        y2 = findViewById(R.id.point_y2);
    }

    public void onLineClick(View view){
        try {
            Line line = new Line(new Point(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString())),
                    new Point(Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString())));
            Toast.makeText(this,
                    (line.onLine(new Point(Double.parseDouble(x.getText().toString()), Double.parseDouble(y.getText().toString()))) ? "Yes" : "No"),
                    Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }
}