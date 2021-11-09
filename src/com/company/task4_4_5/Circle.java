package com.company.task4_4_5;

public class Circle extends Shape implements Cloneable{

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter (){
        return point;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        try {
            Circle cloned = (Circle) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null; // Can’t happen
        }
    }

}
