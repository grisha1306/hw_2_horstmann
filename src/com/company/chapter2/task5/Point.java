package com.company.chapter2.task5;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        double newX = this.x + x;
        double newY = this.y + y;
        return new Point (newX, newY);
    }

    public Point scale(double scale) {
        return new Point(this.x*scale, this.y * scale);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
