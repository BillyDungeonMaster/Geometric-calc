package com.example.project2;

public class Vector {
    double x, y;
    double module;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        module = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public boolean isCollinear(Vector a){
        return a.x / this.x == a.y / this.y;
    }
    public void sumWith(Vector a){
        this.x += a.x;
        this.y += a.y;
    }
    public void takeAway(Vector a){
        this.x -= a.x;
        this.y -= a.y;
    }
    public double scalarProduct(Vector a){
        return a.x * this.x + a.y * this.y;
    }
}