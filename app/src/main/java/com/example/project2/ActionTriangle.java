package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActionTriangle extends AppCompatActivity {

    private EditText x1, x2, x3, y1, y2, y3;

    private TextView side1, side2, side3, angle1, angle2, angle3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action4);
        x1 = findViewById(R.id.point_x1);
        x2 = findViewById(R.id.point_x2);
        x3 = findViewById(R.id.point_x3);
        y1 = findViewById(R.id.point_y1);
        y2 = findViewById(R.id.point_y2);
        y3 = findViewById(R.id.point_y);
        side1 = findViewById(R.id.TriangleSide1);
        side2 = findViewById(R.id.TriangleSide2);
        side3 = findViewById(R.id.TriangleSide3);
        angle1 = findViewById(R.id.TriangleAng1);
        angle2 = findViewById(R.id.TriangleAng2);
        angle3 = findViewById(R.id.TriangleAng3);
    }

    public void triangleOnClick(View view){
        try{
            Line a = new Line(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString()),
                    Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()));
            if(!a.onLine(new Point(Double.parseDouble(x3.getText().toString()), Double.parseDouble(y3.getText().toString())))){
                Triangle triangle = new Triangle(Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString()),
                        Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()),
                        Double.parseDouble(x3.getText().toString()), Double.parseDouble(y3.getText().toString()));
                side1.setText(Double.toString(triangle.a.length));
                side2.setText(Double.toString(triangle.b.length));
                side3.setText(Double.toString(triangle.c.length));
                angle1.setText(Double.toString(triangle.a.angleBetween(triangle.b)));
                angle2.setText(Double.toString(triangle.b.angleBetween(triangle.c)));
                angle3.setText(Double.toString(triangle.a.angleBetween(triangle.c)));
            }
            else{
                Toast.makeText(this, "Точки должны быть различны, и не лежать на одной прямой", Toast.LENGTH_LONG);
            }
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
        }
    }
}