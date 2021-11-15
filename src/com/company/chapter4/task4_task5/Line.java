package com.company.chapter4.task4_task5;

public class Line extends Shape implements Cloneable{
    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super();
        this.from = from;
        this.to = to;
        this.point = new Point((from.getX() + to.getX())/2,(from.getY() + to.getY())/2);

    }

    @Override
    public Point getCenter (){
        return point;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
//            cloned.from = new Point(from.getX(), from.getY());
//            cloned.to = new Point(to.getX(),to.getY());
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null; // Can’t happen
        }
    }

}
