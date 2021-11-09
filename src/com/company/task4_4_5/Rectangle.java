package com.company.task4_4_5;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + (width / 2), (point.getY() + (height / 2)));
    }

    @Override
    public Rectangle clone() {
        try {
            Rectangle cloned = (Rectangle) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null; // Can’t happen
        }
    }
}
