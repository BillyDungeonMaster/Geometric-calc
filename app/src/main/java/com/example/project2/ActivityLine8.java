package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLine8 extends AppCompatActivity {
    private EditText line1_x1, line1_y1, line1_x2, line1_y2, line2_x1, line2_y1, line2_x2, line2_y2;
    private TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line8);
        line1_x1 = findViewById(R.id.line_x1);
        line1_y1 = findViewById(R.id.line_y1);
        line1_x2 = findViewById(R.id.line_x2);
        line1_y2 = findViewById(R.id.line_y2);
        line2_x1 = findViewById(R.id.line2_x1);
        line2_y1 = findViewById(R.id.line2_y1);
        line2_x2 = findViewById(R.id.line2_x2);
        line2_y2 = findViewById(R.id.line2_y2);
        ans = findViewById(R.id.textView10);
    }

    public void insectPoint(View view){
        try {
            Line a = new Line(Double.parseDouble(line1_x1.getText().toString()), Double.parseDouble(line1_y1.getText().toString()),
                    Double.parseDouble(line1_x2.getText().toString()), Double.parseDouble(line1_y2.getText().toString()));
            ans.setText(a.intersectionPointWith(new Line(Double.parseDouble(line2_x1.getText().toString()), Double.parseDouble(line2_y1.getText().toString()),
                    Double.parseDouble(line2_x2.getText().toString()), Double.parseDouble(line2_y2.getText().toString()))).toString());
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }

    @SuppressLint("SetTextI18n")
    public void angleBetweenLines(View view){
        try {
            Line a = new Line(Double.parseDouble(line1_x1.getText().toString()), Double.parseDouble(line1_y1.getText().toString()),
                    Double.parseDouble(line1_x2.getText().toString()), Double.parseDouble(line1_y2.getText().toString()));
            Line b = new Line(Double.parseDouble(line2_x1.getText().toString()), Double.parseDouble(line2_y1.getText().toString()),
                    Double.parseDouble(line2_x2.getText().toString()), Double.parseDouble(line2_y2.getText().toString()));
            ans.setText(Double.toString(a.angleBetween(b)));
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }
}