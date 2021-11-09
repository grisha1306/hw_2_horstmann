package com.company.task4_4_5;

public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Shape() {

    }

    public void moveBy (double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    abstract public Point getCenter ();
}
