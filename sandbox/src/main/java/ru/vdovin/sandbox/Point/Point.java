package ru.vdovin.sandbox.Point;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sayDistanceto(Point p) {
        double dis = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return dis;

    }
}
