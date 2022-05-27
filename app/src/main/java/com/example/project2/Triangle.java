package com.example.project2;

public class Triangle {
    Line a,b,c;
    public Triangle(Point a, Point b, Point c){
        this.a = new Line(a, b);
        this.b = new Line(b, c);
        this.c = new Line(a, c);
    }

    public Triangle(Line a, Line b, Line c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.a = new Line(new Point(x1, y1), new Point(x2, y2));
        this.b = new Line(new Point(x2, y2), new Point(x3, y3));
        this.c = new Line(new Point(x1, y1), new Point(x3, y3));
    }
}
