package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActionVec extends AppCompatActivity {

    EditText x1, x2, y1, y2, x, y;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action2);
        x = findViewById(R.id.point_x);
        y = findViewById(R.id.point_y);
        x1 = findViewById(R.id.point_x1);
        x2 = findViewById(R.id.point_x2);
        y1 = findViewById(R.id.point_y1);
        y2 = findViewById(R.id.point_y2);
        ans  = findViewById(R.id.textView4);
    }

    public void vectorPlus(View view){
        try {
            Vector a = new Vector(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString())),
                    b = new Vector(Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()));
            a.sumWith(b);
            x.setText(Double.toString(a.x));
            y.setText(Double.toString(a.y));
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }

    public void vectorMinus(View view){
        try {
            Vector a = new Vector(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString())),
                    b = new Vector(Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()));
            a.takeAway(b);
            x.setText(Double.toString(a.x));
            y.setText(Double.toString(a.y));
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }

    public void scalarProduct(View view){
        try {
            Vector a = new Vector(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString())),
                    b = new Vector(Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()));
            ans.setText(Double.toString(a.scalarProduct(b)));
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }

    public void isCollinear(View view){
        try {
            Vector a = new Vector(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString())),
                    b = new Vector(Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()));
            Toast.makeText(this, (a.isCollinear(b) ? "Yes" : "No"), Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }
}