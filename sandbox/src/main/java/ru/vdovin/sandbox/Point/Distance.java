package ru.vdovin.sandbox.Point;

public class Distance {
    public static void main(String[] args) {

        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 13);
        System.out.println("Вызов метода Distance из класса main, расстояние равно = " + Distance(p1, p2));
        System.out.println("Вызов метода sayDistanceto через объект, расстояние равно =  " + p2.sayDistanceto(p1));

    }

    public static double Distance(Point p1, Point p2) {
        double dis = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return dis;

    }
}
