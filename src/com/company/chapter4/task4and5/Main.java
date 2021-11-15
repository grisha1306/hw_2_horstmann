package com.company.chapter4.task4and5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Circle circle = new Circle(new Point(1,1),5);
//        System.out.println(circle.getCenter());
//        Circle circleClone = circle.clone();
//        circle.moveBy(1,1);
//        System.out.println(circleClone.getCenter());
//        circle.setRadius(10);
//        System.out.println(circle.getRadius());
//        System.out.println(circleClone.getRadius());

//        Rectangle rectangle = new Rectangle(new Point(1,1),4,7);
//        System.out.println(rectangle.getCenter());
//        rectangle.moveBy(1,1);
//        System.out.println(rectangle.getCenter());

        Line line = new Line(new Point(1,1), new Point(5,1));
        System.out.println(line.getCenter());
        line.moveBy(1,1);
        System.out.println(line.getCenter());

    }

}
